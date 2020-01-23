package com.singtel.interview.model.enumeration.SoundsByLanguage;

import java.util.Arrays;

public enum GermanSounds {

    ROOSTER("kikeriki");

    private final String sound;

    GermanSounds(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public String getByName(String name) {
        return Arrays
                .stream(GermanSounds.values())
                .filter(germanSounds -> germanSounds.name().equalsIgnoreCase(name))
                .findFirst().map(Enum::name)
                .orElse(null);
    }
}
