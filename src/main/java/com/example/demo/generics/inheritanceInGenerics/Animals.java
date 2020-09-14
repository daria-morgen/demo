package com.example.demo.generics.inheritanceInGenerics;

import com.example.demo.generics.inheritanceInGenerics.aminal.Animal;

public class Animals <T extends Animal>{
    T[] animals;

    public Animals(T[] animals) {
        this.animals = animals;
    }

    public T[] getAnimals() {
        return animals;
    }
}
