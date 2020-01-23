package com.singtel.interview.model.enumeration.SoundsByLanguage;

import java.util.Arrays;

public enum FrenchSounds {

    ROOSTER("cocorico");

    private final String sound;

    FrenchSounds(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public static String getByName(String name) {
        return Arrays
                .stream(FrenchSounds.values())
                .filter(frenchSounds -> frenchSounds.name().equalsIgnoreCase(name))
                .findFirst().map(FrenchSounds::getSound)
                .orElse(null);
    }
}
