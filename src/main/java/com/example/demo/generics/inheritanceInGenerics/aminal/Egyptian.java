package com.example.demo.generics.inheritanceInGenerics.aminal;

/**
 * Египетский кот
 */
public class Egyptian extends Cat {

    private String favoriteFood;

    public Egyptian(String color, String voice,String favoriteFood) {
        super(color, voice);
        this.favoriteFood=favoriteFood;
    }

}
