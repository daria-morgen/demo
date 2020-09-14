package com.example.demo.generics.nonGenericExample;

import java.math.BigDecimal;

public class PlasticBagNonGeneric {

    Object fruit;

    BigDecimal cost;

    Integer weight;

    public PlasticBagNonGeneric(Object fruit){
        this.fruit = fruit;
    }

    public PlasticBagNonGeneric(Object fruit, BigDecimal cost, Integer weight) {
        this.fruit = fruit;
        this.cost=cost;
        this.weight = weight;
    }

    public Object getFruit() {
        return fruit;
    }

    public void showType() {
        System.out.println("Type of fruit non generic is: " + fruit.getClass().getName());
    }
}