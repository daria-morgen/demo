package com.example.demo.generics.inheritanceInGenerics.aminal;

public class Dog extends Animal {

    private String voice;

    public Dog(String color,String voice) {
        super(color);
        this.voice=voice;
    }
}
