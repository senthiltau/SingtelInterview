package com.singtel.interview.model;

import com.singtel.interview.SeaAnimals;

public class Fish extends Animal implements SeaAnimals {

    private String color;
    private String size;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String walk() {
        return "I don't walk";
    }

    @Override
    public String sing() {
        return AnimalSounds.DOESNT_SING.getSound();
    }

    public String specialSkills() {
        return null;
    }
}
