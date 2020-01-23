package com.singtel.interview.model;

import com.singtel.interview.Chicken;
import com.singtel.interview.model.enumeration.AnimalSounds;
import com.singtel.interview.model.enumeration.BirdSounds;
import org.junit.Test;

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
        bird = new Hen();
        String actual = bird.sing();
        assertEquals(BirdSounds.HEN.getSound(), actual);
    }

    @Test
    public void testChickenCannotFly() {
        Chicken bird = new Hen();
        String actual = bird.fly();
        assertEquals("I cannot fly. My wings are clipped :(", actual);
    }

    @Test
    public void testDuckCanSwim() {
        Duck bird = new Duck();
        String actual = bird.swim();
        assertEquals("I am swimming", actual);
    }

    @Test
    public void testRoosterSound() {
        Chicken bird = new Rooster();
        String actual = bird.sing();
        assertEquals(BirdSounds.ROOSTER.getSound(), actual);
    }

    @Test
    public void testParrotFriendOfCat() {
        Parrot bird = new Parrot();
        bird.setFriendAnimal(new Cat());
        String actual = bird.sing();
        assertEquals(AnimalSounds.CAT.getSound(), actual);
    }

    @Test
    public void testParrotFriendOfDog() {
        Parrot bird = new Parrot();
        bird.setFriendAnimal(new Dog());
        String actual = bird.sing();
        assertEquals(AnimalSounds.DOG.getSound(), actual);
    }

    @Test
    public void testParrotFriendOfRooster() {
        Parrot bird = new Parrot();
        bird.setFriendAnimal(new Rooster());
        String actual = bird.sing();
        assertEquals(BirdSounds.ROOSTER.getSound(), actual);
    }

}