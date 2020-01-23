package com.singtel.interview.model;

import com.singtel.interview.Chicken;
import com.singtel.interview.model.enumeration.BirdSounds;

public class Rooster extends Bird implements Chicken {

    public Rooster() {
        setCanFly(false);
    }

    public String sing() {
        return BirdSounds.ROOSTER.getSound();
    }

    public String fly() {
        return null;
    }
}
