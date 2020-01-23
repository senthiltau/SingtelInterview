package com.singtel.interview.model;

public enum AnimalSounds {
    DOG("Woof, woof"),
    CAT("Meow");

    private final String sound;

    AnimalSounds(final String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}
