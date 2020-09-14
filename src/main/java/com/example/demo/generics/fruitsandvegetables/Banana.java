package com.example.demo.generics.fruitsandvegetables;

import com.example.demo.generics.Growable;

public class Banana extends Fruit implements Growable {
    @Override
    public void grow() {
        System.out.println(this.getClass().getName() + "is grow");
    }
}
