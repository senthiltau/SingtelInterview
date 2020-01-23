package com.singtel.interview.model;

import com.singtel.interview.model.enumeration.Languages;

public class Butterfly extends Animal {

    public Butterfly() {
        setCanFly(true);
        setCanSing(false);
        setCanWalk(false);
    }

    @Override
    public String fly() {
        return "I can fly";
    }

    @Override
    public String sing(Languages language) {
        return "I don't sing";
    }
}
