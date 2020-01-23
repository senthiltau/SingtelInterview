package com.singtel.interview.model;

import com.singtel.interview.SeaAnimals;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {
    private Fish fish;

    @Test
    public void testFishDontSing() {
        fish = new Fish();
        String actual = fish.sing();
        assertEquals(AnimalSounds.DOESNT_SING.getSound(), actual);
    }

    @Test
    public void testFishDontWalk() {
        fish = new Fish();
        String actual = fish.walk();
        assertEquals("I don't walk", actual);
    }

    @Test
    public void testFishCanSwim() {
        fish = new Fish();
        String actual = fish.swim();
        assertEquals("I can swim", actual);
    }

    @Test
    public void testSharksLargeAndGrey() {
        fish = new Shark();
        fish.setColor(ColorEnum.GREY.name());
        fish.setSize(SizeEnum.LARGE.name());
        assertEquals("GREY", fish.getColor());
        assertEquals("LARGE", fish.getSize());
    }

    @Test
    public void testClownFishesSmallAndOrange() {
        fish = new ClownFish();
        fish.setColor(ColorEnum.ORANGE.name());
        fish.setSize(SizeEnum.SMALL.name());
        assertEquals("ORANGE", fish.getColor());
        assertEquals("SMALL", fish.getSize());
    }

    @Test
    public void testSharkSpecialSKills() {
        fish = new Shark();
        String actual = fish.specialSkills();
        assertEquals("I ate other fish", actual);
    }

    @Test
    public void testClownFishSpecialSKills() {
        fish = new ClownFish();
        String actual = fish.specialSkills();
        assertEquals("I make jokes. Ha ha ha", actual);
    }

    @Test
    public void testDolphinCanSwim() {
        SeaAnimals dolphin = new Dolphin();
        assertEquals("I can swim", dolphin.swim());
    }
}
