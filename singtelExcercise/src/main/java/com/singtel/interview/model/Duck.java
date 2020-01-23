package com.singtel.interview.model;

public class Duck extends Bird {
    @Override
    public String sing() {
        return BirdSounds.DUCK.getSound();
    }

    public String swim() {
        return "I am swimming";
    }
}
