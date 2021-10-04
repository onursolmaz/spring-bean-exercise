package org.renova.domain;

import java.util.HashMap;
import java.util.Map;

public class TechnologyStore {

    public Map<String, Double> productList=new HashMap<>();

    public Map<String, Double> getProductList() {
        return productList;
    }

    public void setProductList(Map<String, Double> productList) {
        this.productList = productList;
    }

    public void welcome(){
        System.out.println("Welcome, tech store");
    }

    public void goodBy(){
        System.out.println("Thanks for visiting by our tech store");
    }
}
