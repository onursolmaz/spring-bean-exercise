package org.renova.domain;

public class Customer {
    private String name;
    private String test;


    public Customer() {
    }

    public Customer(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

}
