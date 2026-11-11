
package com.foodordering.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customer_orders")
public class CustomerOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    private String customerName;
    private String phone;

    @Column(length = 1000)
    private String deliveryAddress;

    private BigDecimal totalAmount;
    private LocalDateTime orderDate;
    private String status;

    @OneToMany(
        mappedBy = "customerOrder",
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private List<OrderItem> items = new ArrayList<>();

    public CustomerOrder() {
    }

    public void addItem(OrderItem item) {
        items.add(item);
        item.setCustomerOrder(this);
    }

    @PrePersist
    public void beforeSave() {
        if (orderDate == null) {
            orderDate = LocalDateTime.now();
        }
        if (status == null) {
            status = "PLACED";
        }
    }

    public Integer getOrderId() { return orderId; }
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getDeliveryAddress() { return deliveryAddress; }
    public void setDeliveryAddress(String deliveryAddress) { this.deliveryAddress = deliveryAddress; }

    public BigDecimal getTotalAmount() { return totalAmount; }
    public void setTotalAmount(BigDecimal totalAmount) { this.totalAmount = totalAmount; }

    public LocalDateTime getOrderDate() { return orderDate; }
    public String getStatus() { return status; }

    public List<OrderItem> getItems() { return items; }
}

