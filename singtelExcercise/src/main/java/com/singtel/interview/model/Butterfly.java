package com.singtel.interview.model;

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
    public String sing() {
        return "I don't sing";
    }
}
