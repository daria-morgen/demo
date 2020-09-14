package com.example.demo.generics.inheritanceInGenerics.aminal;

import java.util.Objects;

public class Animal {

    private String color;

    public Animal(String color) {
        this.color = color;
    }

    public String showColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(color, animal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
