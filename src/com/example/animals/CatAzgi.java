package com.example.animals;

/**
 * Created by andranik on 3/23/17.
 */
public abstract class CatAzgi extends Animal{

    public CatAzgi() {
    }

    public CatAzgi(String name) {
        super(name);
    }

    @Override
    public void walk() {
        System.out.println("walk in CatAzgi , name = " + name);
    }
}
