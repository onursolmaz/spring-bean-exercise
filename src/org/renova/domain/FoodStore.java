package org.renova.domain;

import java.util.HashMap;
import java.util.Map;

public class FoodStore {

    // this map keep food name and price
    public Map<String,Double> foodList =new HashMap<String,Double>();

    public Map<String, Double> getFoodList() {
        return foodList;
    }

    public void setFoodList(Map<String, Double> foodList) {
        this.foodList = foodList;
    }

    public void welcome(){
        System.out.println("Welcome, food store");
    }

    public void goodBy(){
        System.out.println("Thanks for visiting by our food store");
    }

}
