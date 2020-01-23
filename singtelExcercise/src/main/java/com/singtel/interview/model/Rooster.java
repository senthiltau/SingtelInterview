package com.singtel.interview.model;

import com.singtel.interview.Chicken;
import com.singtel.interview.model.enumeration.BirdSounds;
import com.singtel.interview.model.enumeration.Languages;

public class Rooster extends Bird implements Chicken {

    public Rooster() {
        setCanFly(false);
    }

    @Override
    public String sing(Languages language) {
        return BirdSounds.ROOSTER.getSound();
    }

    public String fly() {
        return null;
    }
}
