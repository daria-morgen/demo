package com.example.demo.generics.inheritanceInGenerics.aminal;

import java.util.Objects;

/**
 * Доберман
 */
public class Doberman extends Dog{

    private String favoriteFood;

    public Doberman(String color, String voice,String favoriteFood) {
        super(color, voice);
        this.favoriteFood = favoriteFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doberman doberman = (Doberman) o;
        return Objects.equals(favoriteFood, doberman.favoriteFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(favoriteFood);
    }
}
