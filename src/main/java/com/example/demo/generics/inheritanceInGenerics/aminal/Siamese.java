package com.example.demo.generics.inheritanceInGenerics.aminal;

import java.util.Objects;

/**
 * Сиамский кот
 */
public class Siamese extends Cat{

    String favoriteFood;

    public Siamese(String color, String voice, String favoriteFood) {
        super(color, voice);
        this.favoriteFood=favoriteFood;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Siamese siamese = (Siamese) o;
        return Objects.equals(favoriteFood, siamese.favoriteFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(favoriteFood);
    }
}
