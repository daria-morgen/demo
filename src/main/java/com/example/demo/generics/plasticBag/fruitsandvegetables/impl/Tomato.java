package com.example.demo.generics.plasticBag.fruitsandvegetables.impl;

import com.example.demo.generics.plasticBag.fruitsandvegetables.Growable;

public class Tomato implements Growable {
    @Override
    public void grow() {
        System.out.println(this.getClass().getName() + "is grow");
    }
}
