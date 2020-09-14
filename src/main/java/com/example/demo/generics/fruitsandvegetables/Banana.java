package com.example.demo.generics.fruitsandvegetables;

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
