package com.singtel.interview.model;

import com.singtel.interview.SeaAnimals;

public class Shark extends Fish implements SeaAnimals {

    @Override
    public String specialSkills() {
        return "I eat other fish";
    }
}
