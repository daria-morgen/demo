package com.example.demo;

import com.example.demo.generics.PlasticBag;
import com.example.demo.generics.PlasticBagNonGeneric;
import com.example.demo.generics.PlasticBagOnlyForFruit;
import com.example.demo.generics.PlasticBagOnlyForFruitAndGrow;
import com.example.demo.generics.fruitsandvegetables.Apple;
import com.example.demo.generics.fruitsandvegetables.Banana;
import com.example.demo.generics.fruitsandvegetables.Tomato;

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


        //
//        Banana banana = applePlasticBag.getFruit(); //compile error
        //
//        applePlasticBag = new PlasticBag<Banana>(new Banana()); //error
        //
//        PlasticBag<int> plasticBagInt = new PlasticBag<int>();//error

        //Ключевым моментом для понимания универсальных типов является то,
        // что ссылка на одну конкретную версию универсального типа несовместима
        // с другой версией того же универсального типа. Например, если предположить,
        // что только что показанная программа, следующая строка кода находится в ошибке
        // и не будет компилироваться:

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

        //Пример с ограничением классов(нам нужны пакеты только для классов фруктов и тех, кто реализует интерфейс Growable)
//compile error
//        PlasticBagOnlyForFruitAndGrow<Tomato> tomatoPlasticBagOnlyForFruitAndGrow =  new PlasticBagOnlyForFruitAndGrow<Tomato>(new Tomato());//compile error
//compile error
//        PlasticBagOnlyForFruitAndGrow<Apple> applePlasticBagOnlyForFruitAndGrow =  new PlasticBagOnlyForFruitAndGrow<Apple>(new Apple());//compile error
        PlasticBagOnlyForFruitAndGrow<Banana> bananaPlasticBagOnlyForFruitAndGrow =  new PlasticBagOnlyForFruitAndGrow<Banana>(new Banana());//compile error
        bananaPlasticBagOnlyForFruitAndGrow.getFruit().grow();

    }

}
