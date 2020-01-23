package com.singtel.interview.model;

import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertEquals;

public class BirdTest {

    private Bird bird;
    @Test
    public void testBirdsSing() {
         bird = new Bird();
        String actual = bird.sing();
        assertEquals(BirdSounds.DEFAULT.getSound(), actual);
    }

    @Test
    public void testDuckSingingQuack() {
        bird = new Duck();
        String actual = bird.sing();
        assertEquals(BirdSounds.DUCK.getSound(), actual);
    }

    @Test
    public void testChickenSingingCluck() {
        bird = new Chicken();
        String actual = bird.sing();
        assertEquals(BirdSounds.CHICKEN.getSound(), actual);
    }

    @Test
    public void testChickenCannotFly() {
        bird = new Chicken();
        String actual = bird.fly();
        assertEquals("I cannot fly. My wings are clipped :(", actual);
    }

    @Test
    public void testDuckCanSwim() {
        Duck bird = new Duck();
        String actual = bird.swim();
        assertEquals("I am swimming", actual);
    }

}