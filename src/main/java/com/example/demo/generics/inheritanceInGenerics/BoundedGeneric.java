package com.example.demo.generics.inheritanceInGenerics;

import com.example.demo.generics.inheritanceInGenerics.aminal.Animal;
import com.example.demo.generics.inheritanceInGenerics.aminal.Cat;

public class BoundedGeneric {

    private Animal animal;

    /**
     * Generic Constructors
     * @param animal
     * @param <T>
     */
    public <T extends Animal> BoundedGeneric(T animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public static void showColor(Animals<?> animals) {
        for (int i = 0; i < animals.getAnimals().length; i++) {
            System.out.println(animals.getAnimals()[i].showColor());
        }
    }

    public static void showVoice(Animals<? extends Cat> animals) {
        for (int i = 0; i < animals.getAnimals().length; i++) {
            System.out.println(animals.getAnimals()[i].getVoice());
        }
    }

    /**
     * Статический обобщенный метод, проверяет наличие конкретного животного в коллекции животных.
     *
     * @param animal
     * @param animals
     * @param <T>
     * @param <V>
     * @return
     */
    public static <T extends Animal, V extends T> boolean isInAnimals(T animal, V[] animals) {
        for (V en : animals) {
            if (en.equals(animal)) return true;
        }
        return false;
    }

    public static <T extends Cat, V extends T> boolean isInCats(T animal, V[] animals) {
        for (V en : animals) {
            if (en.equals(animal)) return true;
        }
        return false;
    }

}
