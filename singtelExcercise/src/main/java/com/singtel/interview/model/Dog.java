package com.singtel.interview.model;

public class Dog extends Animal {
    @Override
    public String  walk() {
        return super.walk();
    }

    @Override
    public String sing() {
        return AnimalSounds.DOG.getSound();
    }
}
