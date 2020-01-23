package com.singtel.interview.model;

import com.singtel.interview.model.enumeration.BirdSounds;

public class Duck extends Bird {

    public Duck() {
        setCanSwim(true);
    }

    @Override
    public String sing() {
        return BirdSounds.DUCK.getSound();
    }

    public String swim() {
        return "I am swimming";
    }
}
