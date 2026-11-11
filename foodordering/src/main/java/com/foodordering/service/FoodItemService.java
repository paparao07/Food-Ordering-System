
package com.foodordering.service;

import com.foodordering.entity.FoodItem;
import java.util.List;

public interface FoodItemService {

    FoodItem addFood(FoodItem food);

    List<FoodItem> getAllFood();

    FoodItem getFoodById(Integer id);

    FoodItem updateFood(Integer id, FoodItem food);

    void deleteFood(Integer id);
}
