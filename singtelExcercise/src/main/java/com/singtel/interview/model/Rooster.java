package com.singtel.interview.model;

import com.singtel.interview.Chicken;

public class Rooster extends Bird implements Chicken {
    public String sing() {
        return BirdSounds.ROOSTER.getSound();
    }

    public String fly() {
        return null;
    }
}
