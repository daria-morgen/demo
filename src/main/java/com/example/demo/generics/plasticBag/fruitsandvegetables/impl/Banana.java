package com.example.demo.generics.plasticBag.fruitsandvegetables.impl;

import com.example.demo.generics.plasticBag.fruitsandvegetables.Colourable;
import com.example.demo.generics.plasticBag.fruitsandvegetables.Fruit;
import com.example.demo.generics.plasticBag.fruitsandvegetables.Growable;

public class Banana extends Fruit implements Growable, Colourable {
    @Override
    public void grow() {
        System.out.println(this.getClass().getName() + "is grow");
    }

    @Override
    public String getColor() {
        return "Yellow";
    }
}
