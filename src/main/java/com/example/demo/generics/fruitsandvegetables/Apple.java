package com.example.demo.generics.fruitsandvegetables;

public class Apple extends Fruit implements Growable,Colourable {

    @Override
    public String getColor() {
        return "Green";
    }

    @Override
    public void grow() {
        System.out.println(this.getClass().getName() + "is grow");
    }
}
