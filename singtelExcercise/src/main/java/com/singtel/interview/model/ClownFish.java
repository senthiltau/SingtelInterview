package com.singtel.interview.model;

import com.singtel.interview.SeaAnimals;

public class ClownFish extends Fish implements SeaAnimals {

    @Override
    public String specialSkills() {
        return "I make jokes. Ha ha ha";
    }
}
