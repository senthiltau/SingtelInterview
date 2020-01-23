package com.singtel.interview.model;

public class Chicken extends Bird {
    @Override
    public String sing() {
        return BirdSounds.CHICKEN.getSound();
    }

    @Override
    public String fly() {
        return "I cannot fly. My wings are clipped :(";
    }
}
