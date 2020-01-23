package com.singtel.interview.util;

import com.singtel.interview.model.enumeration.AnimalEnum;
import com.singtel.interview.model.enumeration.Language;
import com.singtel.interview.model.enumeration.SoundsByLanguage.*;

public class LanguageUtil {

    public static String getSoundBySecondLanguage(Language language, AnimalEnum animal) {
        if(language != null) {
            switch (language) {
                case DUTCH:
                    return DutchSounds.getByName(animal.name());
                case DANISH:
                    return DanishSounds.getByName(animal.name());
                case FRENCH:
                    return FrenchSounds.getByName(animal.name());
                case GERMAN:
                    return GermanSounds.getByName(animal.name());
                case FINNISH:
                    return FinnishSounds.getByName(animal.name());
                default:
                    return EnglishSounds.getByName(animal.name());
            }
        } else {
            return EnglishSounds.getByName(animal.name());
        }
    }
}
