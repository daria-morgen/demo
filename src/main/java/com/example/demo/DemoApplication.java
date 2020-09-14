package com.example.demo;

import com.example.demo.generics.inheritanceInGenerics.Animals;
import com.example.demo.generics.inheritanceInGenerics.BoundedWildCards;
import com.example.demo.generics.inheritanceInGenerics.aminal.*;
import com.example.demo.generics.plasticBag.PlasticBag;
import com.example.demo.generics.plasticBag.nonGenericExample.PlasticBagNonGeneric;
import com.example.demo.generics.plasticBag.PlasticBagOnlyForFruit;
import com.example.demo.generics.plasticBag.PlasticBagOnlyForFruitAndGrow;
import com.example.demo.generics.plasticBag.fruitsandvegetables.impl.Apple;
import com.example.demo.generics.plasticBag.fruitsandvegetables.impl.Banana;
import com.example.demo.generics.plasticBag.fruitsandvegetables.impl.Tomato;

public class DemoApplication {

    public static void main(String[] args) {

        PlasticBag<Apple> applePlasticBag = new PlasticBag<Apple>(new Apple());
        applePlasticBag.showType();

        Apple apple = applePlasticBag.getFruit();

        PlasticBag<Banana> bananaPlasticBag = new PlasticBag<Banana>(new Banana());
        bananaPlasticBag.showType();
        Banana banana = bananaPlasticBag.getFruit();

        PlasticBag<Tomato> tomatoPlasticBag = new PlasticBag<Tomato>(new Tomato());
        tomatoPlasticBag.showType();
        Tomato tomato = tomatoPlasticBag.getFruit();

        //нельзя присвоить ссылке на банан обьект из пакета с яблоками.
//        Banana banana = applePlasticBag.getFruit(); //compile error
        // Нельзя ссылке пакету с яблоками присвоить обьект пакета с бананами
//        applePlasticBag = new PlasticBag<Banana>(new Banana()); //compile error
        // Только ссылочные типы
//        PlasticBag<int> plasticBagInt = new PlasticBag<int>();//compile error

        /**Ключевым моментом для понимания универсальных типов является то,
        * что ссылка на одну конкретную версию универсального типа несовместима
        * с другой версией того же универсального типа.
        */
//        applePlasticBag = bananaPlasticBag; //error

        //Пример без дженерика
        PlasticBagNonGeneric applePlasticBagNonGen = new PlasticBagNonGeneric(new Apple());
        applePlasticBagNonGen.showType();

//      Apple apple1 = applePlasticBagNonGen.getFruit();//compile error

        Apple apple2 = (Apple) applePlasticBagNonGen.getFruit();// Требуется явное приведение типа

        //Имеется возможность положить в пакет слона
        PlasticBagNonGeneric strangePlasticBagNonGen = new PlasticBagNonGeneric("Elephant");

        //runtime error! java.lang.ClassCastException
//        Apple appleFromStrangePlasticBagNonGen = (Apple) strangePlasticBagNonGen.getFruit();

        //Пример с ограничением классов(нам нужны пакеты только для классов фруктов)
        PlasticBagOnlyForFruit<Apple> applePlasticBagOnlyForFruit = new PlasticBagOnlyForFruit<>(new Apple());
        applePlasticBagOnlyForFruit.showType();
        PlasticBagOnlyForFruit<Banana> bananaPlasticBagOnlyForFruit = new PlasticBagOnlyForFruit<Banana>(new Banana());
        bananaPlasticBagOnlyForFruit.showType();
        //compile error
//        PlasticBagOnlyForFruit<Tomato> plasticBagOnlyForFruit =  new PlasticBagOnlyForFruit<Tomato>(new Tomato());//compile error

        //Пример с ограничением классов(нам нужны пакеты только для классов фруктов и тех,
        // кто реализует интерфейс Growable и Colourable)
        PlasticBagOnlyForFruitAndGrow<Apple> applePlasticBagOnlyForFruitAndGrow = new PlasticBagOnlyForFruitAndGrow<Apple>(new Apple());//compile error
        applePlasticBagOnlyForFruitAndGrow.getFruit().grow();
        PlasticBagOnlyForFruitAndGrow<Banana> bananaPlasticBagOnlyForFruitAndGrow = new PlasticBagOnlyForFruitAndGrow<Banana>(new Banana());//compile error
        bananaPlasticBagOnlyForFruitAndGrow.getFruit().grow();
        //compile error
//        PlasticBagOnlyForFruitAndGrow<Tomato> tomatoPlasticBagOnlyForFruitAndGrow =  new PlasticBagOnlyForFruitAndGrow<Tomato>(new Tomato());//compile error

        /**Using Wildcard Arguments
        * Как бы ни была полезна безопасность типов, иногда она может мешать совершенно приемлемым конструкциям.
        * Например, учитывая класс PlasticBagOnlyForFruitAndGrow, предположим,
        * что вы хотите добавить метод sameColor(), который определяет, содержат ли два объекта
        * PlasticBagOnlyForFruitAndGrow (пакета) с фруктами, возвращающие одинаковый цвет, независимо от того,
        * какой тип данных(фруктов) содержит каждый объект
        */
        /** Добавим в класс PlasticBagOnlyForFruitAndGrow метод sameColor, куда передадим параметризированный обьект
         * Такая реализация не будет работать пока метод sameColor принимает PlasticBagOnlyForFruitAndGrow<T> plasticBag
         * Заменим ее на PlasticBagOnlyForFruitAndGrow<?>
         * Теперь PlasticBagOnlyForFruitAndGrow<?> соответствует любому объекту пакетов с фруктами,
         * позволяя сравнивать цвет двух обьектов
         */
        if (applePlasticBagOnlyForFruitAndGrow.sameColor(bananaPlasticBagOnlyForFruitAndGrow)) {
            System.out.println("Color are the same");
        } else System.out.println("Color are not the same");
        System.out.println("=============================================");
        /**
         * Ограниченный подстановочный знак особенно важен при создании
         * универсального типа, который будет работать с иерархией классов
         */
        Animal animalsAr[] = {
                new Egyptian("pink","mew","fish"),
                new Doberman("black","wow","meet")
        };

        Animals<Animal> animals = new Animals<Animal>(animalsAr);
        // Добавим метод для вывода цвета всех животных
        BoundedWildCards.showColor(animals);



        // Добавим метод для вывода голоса ограничив типы только кошками. используя конструкцию Animals<? extends Cat>
        // Передадим в этот метод объект с животными.
        //compile error
//        BoundedWildCards.showVoice(animals);


        Cat catsAr[] = {
                new Siamese("gray","mew","fish"),
                new Siamese("black","mew","bird"),
                new Egyptian("pink","mew","fish")

        };
        Egyptian egyptian[] = {
                new Egyptian("pink","mew","fish"),
                new Egyptian("pink","mew","fish")
        };
        // Передадим в этот метод объект с кошками.
        Animals<Cat> cats = new Animals<Cat>(catsAr);
        Animals<Egyptian> egyptianAnimals = new Animals<Egyptian>(egyptian);

        BoundedWildCards.showVoice(cats);
        BoundedWildCards.showVoice(egyptianAnimals);

        // Передадим в этот метод объект с собаками.
        Doberman doberman = new Doberman("black", "wow", "meet");
        Dog dogsAr[] = {
                doberman
        };
        Animals<Dog> dogs = new Animals<Dog>(dogsAr);
        //compile error
        //BoundedWildCards.showVoice(dogs);


        System.out.println(BoundedWildCards.isIn(doberman,dogsAr));//true
        System.out.println(BoundedWildCards.isIn(doberman,animalsAr));//true
        System.out.println(BoundedWildCards.isIn(doberman,catsAr));//false

    }

}
