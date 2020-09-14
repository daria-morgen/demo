package com.example.demo.generics;

import com.example.demo.generics.fruitsandvegetables.Fruit;

import java.math.BigDecimal;

public class PlasticBagOnlyForFruitAndGrow<T extends Fruit & Growable> {

    T fruit;

    BigDecimal cost;

    Integer weight;

    public PlasticBagOnlyForFruitAndGrow(T fruit){
        this.fruit = fruit;
    }

    public PlasticBagOnlyForFruitAndGrow(T fruit, BigDecimal cost, Integer weight) {
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