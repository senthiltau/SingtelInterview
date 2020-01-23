package com.singtel.interview.model.enumeration.SoundsByLanguage;

import java.util.Arrays;

public enum DutchSounds {

    ROOSTER("kukeleku");

    private final String sound;

    DutchSounds(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public String getByName(String name) {
        return Arrays
                .stream(DutchSounds.values())
                .filter(dutchSounds -> dutchSounds.name().equalsIgnoreCase(name))
                .findFirst().map(Enum::name)
                .orElse(null);
    }
}
