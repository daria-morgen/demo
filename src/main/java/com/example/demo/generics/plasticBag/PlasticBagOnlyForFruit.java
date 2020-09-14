package com.example.demo.generics.plasticBag;

import com.example.demo.generics.plasticBag.fruitsandvegetables.Fruit;

import java.math.BigDecimal;

public class PlasticBagOnlyForFruit<T extends Fruit> {

    T fruit;

    BigDecimal cost;

    Integer weight;

    public PlasticBagOnlyForFruit(T fruit){
        this.fruit = fruit;
    }

    public PlasticBagOnlyForFruit(T fruit, BigDecimal cost, Integer weight) {
        this.fruit = fruit;
        this.cost=cost;
        this.weight = weight;
    }

    public T getFruit() {
        return fruit;
    }

    public void showType() {
        fruit.showFruit(fruit.getClass().getName());
    }
}