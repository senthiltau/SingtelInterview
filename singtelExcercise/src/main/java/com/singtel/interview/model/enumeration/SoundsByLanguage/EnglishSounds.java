package com.singtel.interview.model.enumeration.SoundsByLanguage;

import java.util.Arrays;

public enum EnglishSounds {
    ROOSTER("Cock-a-doodle-doo");

    private final String sound;

    EnglishSounds(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public static String getByName(String name) {
        return Arrays
                .stream(EnglishSounds.values())
                .filter(englishSounds -> englishSounds.name().equalsIgnoreCase(name))
                .findFirst().map(EnglishSounds::getSound)
                .orElse(null);
    }
}
