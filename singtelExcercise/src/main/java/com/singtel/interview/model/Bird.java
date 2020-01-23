package com.singtel.interview.model;

import com.singtel.interview.model.enumeration.BirdSounds;

public class Bird extends Animal {

    public Bird() {
        setCanFly(true);
        setCanSing(true);
    }

    @Override
    public String fly() {
        return "I am flying";
    }

    public String sing() {
        return BirdSounds.DEFAULT.getSound();
    }
}
