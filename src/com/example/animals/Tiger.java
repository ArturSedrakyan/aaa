package com.example.animals;

/**
 * Created by andranik on 3/23/17.
 */
public class Tiger extends CatAzgi{

    public Tiger(String name) {
        super(name);
    }

    public void eat(){
        System.out.println("eat in Tiger");
    }

    public void makeSound(){
        System.out.println("makeSound in Tiger");
    }
}
