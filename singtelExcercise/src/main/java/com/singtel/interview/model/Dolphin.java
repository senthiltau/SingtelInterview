package com.singtel.interview.model;

import com.singtel.interview.SeaAnimals;

public class Dolphin extends Animal implements SeaAnimals {

    public Dolphin() {
        setCanFly(false);
        setCanWalk(false);
    }
}
