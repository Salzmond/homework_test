package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testSum() {
        int answer = Main.sum(3,3);
        assertEquals(6,answer);
    }

    @Test
    public void testSub() {
        int answer = Main.sub(5,2);
        assertEquals(3,answer);
    }
    @Test
    public void testDiv() {
        int answer = Main.div(3,3);
        assertEquals(1, answer);
    }

    @Test
    public void testMulti() {
        int answer = Main.multi(2,5);
        assertEquals(10, answer);
    }

}