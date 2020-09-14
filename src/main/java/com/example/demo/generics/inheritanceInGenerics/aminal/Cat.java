package com.example.demo.generics.inheritanceInGenerics.aminal;

public class Cat extends Animal{

    private String voice;

    public Cat(String color,String voice) {
        super(color);
        this.voice = voice;
    }

    public String getVoice() {
        return voice;
    }
}
