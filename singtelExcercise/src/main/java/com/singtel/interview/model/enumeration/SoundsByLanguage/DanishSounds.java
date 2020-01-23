package com.singtel.interview.model.enumeration.SoundsByLanguage;

import java.util.Arrays;

public enum DanishSounds {

    ROOSTER("kykyliky");

    private final String sound;

    DanishSounds(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public String getByName(String name) {
        return Arrays
                .stream(DanishSounds.values())
                .filter(danishSounds -> danishSounds.name().equalsIgnoreCase(name))
                .findFirst().map(Enum::name)
                .orElse(null);
    }
}
