package com.singtel.interview.model;

import com.singtel.interview.model.enumeration.AnimalSounds;

public class Cat extends Animal {
    @Override
    public String  walk() {
        return super.walk();
    }

    @Override
    public String sing() {
        return AnimalSounds.CAT.getSound();
    }
}
