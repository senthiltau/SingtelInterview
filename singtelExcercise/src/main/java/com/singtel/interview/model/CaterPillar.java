package com.singtel.interview.model;

public class CaterPillar extends Animal {

    @Override
    public String walk() {
        return "I cannot walk, but crawl";
    }

    @Override
    public String fly() {
        return "I can't fly";
    }
}
