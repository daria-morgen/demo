package com.example.demo.generics;

import java.math.BigDecimal;

public class PlasticBag<T> {

    T fruit;

    BigDecimal cost;

    Integer weight;

    public PlasticBag(T fruit){
        this.fruit = fruit;
    }
    public PlasticBag(T fruit, BigDecimal cost, Integer weight) {
        this.fruit = fruit;
        this.cost=cost;
        this.weight = weight;
    }

    public T getFruit() {
        return fruit;
    }

    public void showType() {
        System.out.println("Type of T is: " + fruit.getClass().getName());
    }

}