package com.example.demo.generics.inheritanceInGenerics;

import com.example.demo.generics.inheritanceInGenerics.aminal.Cat;

public class BoundedWildCards {

    public static void showColor(Animals<?> animals){
        for (int i=0;i<animals.getAnimals().length;i++){
            System.out.println(animals.getAnimals()[i].showColor());
        }
    }

    public static void showVoice(Animals<? extends Cat> animals){
        for (int i=0;i<animals.getAnimals().length;i++){
            System.out.println(animals.getAnimals()[i].getVoice());
        }
    }

}
