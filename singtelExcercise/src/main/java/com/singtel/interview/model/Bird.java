package com.singtel.interview.model;

public class Bird extends Animal {

    @Override
    public String fly() {
        return "I am flying";
    }

    public String sing() {
        return BirdSounds.DEFAULT.getSound();
    }
}
