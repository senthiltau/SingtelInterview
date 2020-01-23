package com.singtel.interview.model;

import com.singtel.interview.model.enumeration.Language;
import com.singtel.interview.model.enumeration.SoundsByLanguage.DanishSounds;
import com.singtel.interview.model.enumeration.SoundsByLanguage.EnglishSounds;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SecondLanguageTest {

    @Test
    public void testSecondLanguage() {
        Animal rooster = new Rooster();
        rooster.setSecondLanguage(Language.DANISH);
        rooster.setSingInSecondLanguage(true);
        assertEquals(DanishSounds.ROOSTER.getSound(), rooster.sing());
    }

    @Test
    public void testSecondLanguageNotSet() {
        Animal rooster = new Rooster();
        rooster.setSecondLanguage(Language.DANISH);
        rooster.setSingInSecondLanguage(false);
        assertEquals(EnglishSounds.ROOSTER.getSound(), rooster.sing());
    }
}
