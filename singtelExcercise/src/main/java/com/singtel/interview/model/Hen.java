package com.singtel.interview.model;

import com.singtel.interview.Chicken;
import com.singtel.interview.model.enumeration.BirdSounds;

public class Hen extends Bird implements Chicken {

    public Hen() {
        setCanFly(false);
    }

    @Override
    public String sing() {
        return BirdSounds.HEN.getSound();
    }

    @Override
    public String fly() {
        return "I cannot fly. My wings are clipped :(";
    }
}
