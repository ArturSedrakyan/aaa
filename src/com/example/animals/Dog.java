package com.example.animals;

/**
 * Created by andranik on 3/23/17.
 */
public class Dog extends DogAzgi implements Pet{

    public void eat(){
        System.out.println("eat in Dog");
    }

    public void makeSound(){
        System.out.println("makeSound in Dog");
    }

    @Override
    public void play() {
        System.out.println("Dog Play");
    }

    @Override
    public void befriendly() {
        System.out.println("Dog be friendly");
    }
}
