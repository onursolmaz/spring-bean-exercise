package org.renova.domain;

import java.util.HashMap;
import java.util.Map;

public class ClothesStore {

    // this map keep clothe name and price
    public Map<String,Double> clothesList=new HashMap<String,Double>();

    public Map<String, Double> getClothesList() {
        return clothesList;
    }

    public void setClothesList(Map<String, Double> clothesList) {
        this.clothesList = clothesList;
    }

    public void welcome(){
        System.out.println("Welcome, clothes store");
    }

    public void goodBy(){
        System.out.println("Thanks for visiting by clothes store");
    }



}
