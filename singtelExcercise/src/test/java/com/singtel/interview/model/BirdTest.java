package com.singtel.interview.model;

import org.junit.Test;
import org.mockito.InjectMocks;

public class BirdTest {

    private Bird bird = new Bird();

    @Test
    public void test() {
        bird.sing();
    }
}