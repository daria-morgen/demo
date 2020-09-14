package com.example.demo.generics.inheritanceInGenerics.aminal;

/**
 * Сиамский кот
 */
public class Siamese extends Cat{

    String favoriteFood;

    public Siamese(String color, String voice, String favoriteFood) {
        super(color, voice);
        this.favoriteFood=favoriteFood;

    }

}
