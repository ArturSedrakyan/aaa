package com.example.animals;

/**
 * Created by stude on 28.03.2017.
 */
public class PetShop {
    private Pet[] pets = new Pet[20];
    private int number = 0;

    public void addPet(Pet pet) {
        pets[number++] = pet;
    }

    public void getAll() {
        for (int i = 0; i < number; i++) {
            if(pets[i] instanceof Cat) {
                ((Cat) pets[i]).getName();
            }
            pets[i].play();
            pets[i].befriendly();
        }
    }
}
