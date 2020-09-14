package com.example.demo.generics.plasticBag.fruitsandvegetables.impl;

import com.example.demo.generics.plasticBag.fruitsandvegetables.Colourable;
import com.example.demo.generics.plasticBag.fruitsandvegetables.Fruit;
import com.example.demo.generics.plasticBag.fruitsandvegetables.Growable;

public class Apple extends Fruit implements Growable, Colourable {

    @Override
    public String getColor() {
        return "Green";
    }

    @Override
    public void grow() {
        System.out.println(this.getClass().getName() + "is grow");
    }
}
