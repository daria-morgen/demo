package com.example.demo.generics.plasticBag;

import com.example.demo.generics.plasticBag.fruitsandvegetables.Colourable;
import com.example.demo.generics.plasticBag.fruitsandvegetables.Fruit;
import com.example.demo.generics.plasticBag.fruitsandvegetables.Growable;

import java.math.BigDecimal;

public class PlasticBagOnlyForFruitAndGrow<T extends Fruit & Colourable & Growable> {

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

    public boolean sameColor(PlasticBagOnlyForFruitAndGrow<?> plasticBag){
        return getPlasticBagColor().equals(plasticBag.getPlasticBagColor());
    }

    /**
     * Метод возвращает цвет пластикового пакета в зависимости от фрукта который в нем лежит
     * @return
     */
    public String getPlasticBagColor(){
        return fruit.getColor();
    }
}