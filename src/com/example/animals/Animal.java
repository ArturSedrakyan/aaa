package com.example.animals;

/**
 * Created by andranik on 3/23/17.
 */
public abstract class Animal {

    protected String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("eat in Animal, name = " + name);
    }

    public abstract void makeSound();

    public void sleep(){
        System.out.println("sleep in Animal, name = " + name);
    }

    public void walk(){
        System.out.println("walk in Animal , name = " + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor(){
        return "";
    }
}
