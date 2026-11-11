
package com.foodordering.controller;

import com.foodordering.entity.FoodItem;
import com.foodordering.service.FoodItemService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
@CrossOrigin(origins = "http://localhost:5173")
public class FoodItemController {

    private final FoodItemService service;

    public FoodItemController(FoodItemService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public ResponseEntity<FoodItem> addFood(
            @RequestBody FoodItem food) {

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(service.addFood(food));
    }

    @GetMapping("/all")
    public List<FoodItem> getAllFood() {
        return service.getAllFood();
    }

    @GetMapping("/{id}")
    public FoodItem getFoodById(@PathVariable Integer id) {
        return service.getFoodById(id);
    }

    @PutMapping("/update/{id}")
    public FoodItem updateFood(
            @PathVariable Integer id,
            @RequestBody FoodItem food) {

        return service.updateFood(id, food);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteFood(
            @PathVariable Integer id) {

        service.deleteFood(id);
        return ResponseEntity.ok("Food item deleted successfully");
    }
}
