package com.singtel.interview.model;

import org.junit.Test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static org.junit.Assert.assertEquals;

public class CountTest {

    public static final String WALK = "Walk";
    public static final String SING = "Sing";
    public static final String SWIM = "Swim";
    public static final String FLY = "Fly";

    @Test
    public void testCount() {
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Hen(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new ClownFish(),
                new Dog(),
                new Butterfly(),
                new Cat()
        };

        Map<String, Integer> countMap = new ConcurrentHashMap<>();
        countMap.put(CountTest.FLY, 0);
        countMap.put(SING, 0);
        countMap.put(WALK, 0);
        countMap.put(SWIM, 0);

        for(Animal animal : animals) {
            if(animal.isCanFly()) countMap.put(CountTest.FLY, countMap.get(CountTest.FLY) + 1);
            if(animal.isCanSing()) countMap.put(SING, countMap.get(SING) + 1);
            if(animal.isCanWalk()) countMap.put(WALK, countMap.get(WALK) + 1);
            if(animal.isCanSwim()) countMap.put(SWIM, countMap.get(SWIM) + 1);
        }

        assertEquals(4, countMap.get(FLY).intValue());
        assertEquals(7, countMap.get(WALK).intValue());
        assertEquals(8, countMap.get(SING).intValue());
        assertEquals(4, countMap.get(SWIM).intValue());
    }
}
