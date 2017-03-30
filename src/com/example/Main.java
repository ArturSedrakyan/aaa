package com.example;

import com.example.animals.*;
import com.example.animals.robot.Robot;
import com.example.animals.robot.RobotDog;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Cat1");
        Cat cat2 = new Cat("Cat2");
        Cat cat3 = new Cat("Cat3");

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        RobotDog robot = new RobotDog();

        PetShop petShop = new PetShop();

        petShop.addPet(cat1);
        petShop.addPet(cat2);
        petShop.addPet(dog1);
        petShop.addPet(dog3);
        petShop.addPet(cat3);
        petShop.addPet(dog3);

        petShop.addPet(robot);

        petShop.getAll();
    }
}