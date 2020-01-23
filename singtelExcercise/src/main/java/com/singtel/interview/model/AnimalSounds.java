package com.singtel.interview.model;

public enum AnimalSounds {
    DOG("Woof, woof"),
    CAT("Meow"),
    DOESNT_SING("I dont sing");

    private final String sound;

    AnimalSounds(final String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}
