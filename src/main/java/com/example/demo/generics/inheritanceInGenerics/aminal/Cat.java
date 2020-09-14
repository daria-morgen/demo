package com.example.demo.generics.inheritanceInGenerics.aminal;

import java.util.Objects;

public class Cat extends Animal{

    private String voice;

    public Cat(String color,String voice) {
        super(color);
        this.voice = voice;
    }

    public String getVoice() {
        return voice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(voice, cat.voice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voice);
    }
}
