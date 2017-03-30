package com.example.animals;

/**
 * Created by andranik on 3/23/17.
 */
public class Cat extends CatAzgi implements Pet{

    private String color;

    public Cat(String name) {
        super(name);
    }

    public void eat(){
        System.out.println("eat in Cat , name = " + name);
    }

    public void makeSound(){
        System.out.println("makeSound in Cat , name = " + name);
    }

    public void playCat(){
        System.out.println("playCat in Cat, name = " + name);
    }

    public String getColor() {
        return color;
    }
    public void getName() {
        System.out.println(name);
    }

    @Override
    public void play() {
        System.out.println("Cat Play");
    }

    @Override
    public void befriendly() {
        System.out.println("Cat be freandly");
    }
}
