package com.example.demo.generics.fruitsandvegetables;

public class Tomato implements Growable {
    @Override
    public void grow() {
        System.out.println(this.getClass().getName() + "is grow");
    }
}
