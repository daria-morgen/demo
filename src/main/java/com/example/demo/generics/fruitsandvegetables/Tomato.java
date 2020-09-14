package com.example.demo.generics.fruitsandvegetables;

import com.example.demo.generics.Growable;

public class Tomato implements Growable {
    @Override
    public void grow() {
        System.out.println(this.getClass().getName() + "is grow");
    }
}
