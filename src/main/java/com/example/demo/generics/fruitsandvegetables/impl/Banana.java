package com.example.demo.generics.fruitsandvegetables.impl;

import com.example.demo.generics.fruitsandvegetables.Colourable;
import com.example.demo.generics.fruitsandvegetables.Fruit;
import com.example.demo.generics.fruitsandvegetables.Growable;

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
