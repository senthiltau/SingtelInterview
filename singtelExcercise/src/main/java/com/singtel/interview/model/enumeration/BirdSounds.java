package com.singtel.interview.model.enumeration;

public enum BirdSounds {

    DUCK("Quack, quack"),
    HEN("Cluck, cluck"),
    ROOSTER("Cock-a-doodle-doo"),
    DEFAULT("I am Singing");

    private final String sound;
    BirdSounds(final String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}
