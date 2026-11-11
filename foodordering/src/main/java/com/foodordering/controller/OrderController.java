
package com.foodordering.controller;

import com.foodordering.entity.CustomerOrder;
import com.foodordering.entity.FoodItem;
import com.foodordering.entity.OrderItem;
import com.foodordering.repository.CustomerOrderRepository;
import com.foodordering.repository.FoodItemRepository;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/orders")
@CrossOrigin(origins = "http://localhost:5173")
public class OrderController {

    private final CustomerOrderRepository orderRepository;
    private final FoodItemRepository foodRepository;

    public OrderController(
            CustomerOrderRepository orderRepository,
            FoodItemRepository foodRepository) {
        this.orderRepository = orderRepository;
        this.foodRepository = foodRepository;
    }

    @PostMapping("/checkout")
    public ResponseEntity<?> checkout(
            @RequestBody OrderRequest request) {

        if (request.customerName == null
                || request.customerName.isBlank()
                || request.phone == null
                || !request.phone.matches("[0-9]{10}")
                || request.deliveryAddress == null
                || request.deliveryAddress.isBlank()
                || request.items == null
                || request.items.isEmpty()) {
            return ResponseEntity.badRequest()
                    .body("Enter valid customer details and at least one food item.");
        }

        CustomerOrder order = new CustomerOrder();
        order.setCustomerName(request.customerName.trim());
        order.setPhone(request.phone);
        order.setDeliveryAddress(request.deliveryAddress.trim());

        BigDecimal total = BigDecimal.ZERO;

        try {
            for (OrderLine line : request.items) {
                if (line.foodId == null
                        || line.quantity == null
                        || line.quantity < 1
                        || line.quantity > 100) {
                    return ResponseEntity.badRequest()
                            .body("Invalid food ID or quantity.");
                }

                FoodItem food = foodRepository
                        .findById(line.foodId)
                        .orElse(null);

                if (food == null
                        || !Boolean.TRUE.equals(food.getAvailable())) {
                    return ResponseEntity.badRequest()
                            .body("A selected food item is unavailable.");
                }

                OrderItem item = new OrderItem();
                item.setFoodId(food.getFoodId());
                item.setFoodName(food.getFoodName());
                item.setQuantity(line.quantity);
                item.setPrice(food.getPrice());

                order.addItem(item);

                BigDecimal lineTotal = food.getPrice()
                        .multiply(BigDecimal.valueOf(line.quantity));

                total = total.add(lineTotal);
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest()
                    .body("Unable to process the order.");
        }

        order.setTotalAmount(total);
        CustomerOrder savedOrder = orderRepository.save(order);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedOrder);
    }

    public static class OrderRequest {
        public String customerName;
        public String phone;
        public String deliveryAddress;
        public List<OrderLine> items;
    }

    public static class OrderLine {
        public Integer foodId;
        public Integer quantity;
    }
}
