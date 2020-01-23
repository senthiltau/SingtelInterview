package com.singtel.interview.model;

import com.singtel.interview.SeaAnimals;

public class Shark extends Fish implements SeaAnimals {

    public Shark() {
        super();
    }

    @Override
    public String specialSkills() {
        return "I eat other fish";
    }
}
