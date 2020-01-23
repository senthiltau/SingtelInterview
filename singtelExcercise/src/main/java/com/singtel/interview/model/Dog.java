package com.singtel.interview.model;

import com.singtel.interview.model.enumeration.AnimalSounds;
import com.singtel.interview.model.enumeration.Languages;

public class Dog extends Animal {
    @Override
    public String  walk() {
        return super.walk();
    }

    @Override
    public String sing(Languages language) {
        return AnimalSounds.DOG.getSound();
    }
}
