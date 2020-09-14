package com.example.demo.generics.inheritanceInGenerics.aminal;

/**
 * Доберман
 */
public class Doberman extends Dog{

    private String favoriteFood;

    public Doberman(String color, String voice,String favoriteFood) {
        super(color, voice);
        this.favoriteFood = favoriteFood;
    }

}
