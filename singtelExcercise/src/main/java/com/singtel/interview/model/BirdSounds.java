package com.singtel.interview.model;

public enum BirdSounds {

    DUCK("Quack, quack"),
    CHICKEN("Cluck, cluck"),
    DEFAULT("I am Singing");

    private final String sound;
    BirdSounds(final String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}
