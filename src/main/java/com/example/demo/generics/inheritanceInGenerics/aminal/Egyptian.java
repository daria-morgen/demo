package com.example.demo.generics.inheritanceInGenerics.aminal;

import java.util.Objects;

/**
 * Египетский кот
 */
public class Egyptian extends Cat {

    private String favoriteFood;

    public Egyptian(String color, String voice,String favoriteFood) {
        super(color, voice);
        this.favoriteFood=favoriteFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Egyptian egyptian = (Egyptian) o;
        return Objects.equals(favoriteFood, egyptian.favoriteFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(favoriteFood);
    }
}
