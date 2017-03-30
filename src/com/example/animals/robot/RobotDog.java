package com.example.animals.robot;

import com.example.animals.Pet;

/**
 * Created by stude on 28.03.2017.
 */
public class RobotDog extends Robot implements Pet {

    public void bork() {

    }

    @Override
    public void play() {
        System.out.println("Robot Dog Play");
    }

    @Override
    public void befriendly() {
        System.out.println("Robot Dog be friendly");
    }
}
