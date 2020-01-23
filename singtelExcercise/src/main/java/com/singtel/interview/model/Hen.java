package com.singtel.interview.model;

import com.singtel.interview.Chicken;

public class Hen extends Bird implements Chicken {
    @Override
    public String sing() {
        return BirdSounds.HEN.getSound();
    }

    @Override
    public String fly() {
        return "I cannot fly. My wings are clipped :(";
    }
}
