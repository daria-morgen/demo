package com.example.demo.generics.inheritanceInGenerics.aminal;

import java.util.Objects;

public class Dog extends Animal {

    private String voice;

    public Dog(String color,String voice) {
        super(color);
        this.voice=voice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(voice, dog.voice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voice);
    }
}
