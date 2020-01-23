package com.singtel.interview.model;

import com.singtel.interview.model.enumeration.BirdSounds;
import com.singtel.interview.model.enumeration.Languages;

public class Duck extends Bird {

    public Duck() {
        setCanSwim(true);
    }

    @Override
    public String sing(Languages language) {
        return BirdSounds.DUCK.getSound();
    }

    public String swim() {
        return "I am swimming";
    }
}
