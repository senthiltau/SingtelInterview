package com.singtel.interview.model.enumeration.SoundsByLanguage;

import java.util.Arrays;

public enum FinnishSounds {

    ROOSTER("kukko kiekuu");

    private final String sound;

    FinnishSounds(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public static String getByName(String name) {
        return Arrays
                .stream(FinnishSounds.values())
                .filter(finnishSounds -> finnishSounds.name().equalsIgnoreCase(name))
                .findFirst().map(FinnishSounds::getSound)
                .orElse(null);
    }
}
