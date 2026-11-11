
package com.foodordering.service;

import com.foodordering.entity.FoodItem;
import com.foodordering.repository.FoodItemRepository;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FoodItemServiceImpl implements FoodItemService {

    private final FoodItemRepository repository;

    public FoodItemServiceImpl(FoodItemRepository repository) {
        this.repository = repository;
    }

    @Override
    public FoodItem addFood(FoodItem food) {
        food.setFoodId(null);
        return repository.save(food);
    }

    @Override
    public List<FoodItem> getAllFood() {
        return repository.findAll();
    }

    @Override
    public FoodItem getFoodById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() ->
                    new RuntimeException("Food item not found: " + id));
    }

    @Override
    public FoodItem updateFood(Integer id, FoodItem food) {
        FoodItem existing = getFoodById(id);

        existing.setFoodName(food.getFoodName());
        existing.setCategory(food.getCategory());
        existing.setPrice(food.getPrice());
        existing.setImageUrl(food.getImageUrl());
        existing.setAvailable(food.getAvailable());

        return repository.save(existing);
    }

    @Override
    public void deleteFood(Integer id) {
        FoodItem existing = getFoodById(id);
        repository.delete(existing);
    }
}
