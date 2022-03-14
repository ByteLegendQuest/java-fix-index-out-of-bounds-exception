package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChallengeTest {
    @Test
    public void test() {
        Assertions.assertNull(Challenge.firstOrNull(new Object[0]));
        Assertions.assertNull(Challenge.lastOrNull(new Object[0]));
        Assertions.assertEquals(1, Challenge.firstOrNull(new Object[] {1}));
        Assertions.assertEquals(1, Challenge.lastOrNull(new Object[] {1}));
        Assertions.assertEquals("1", Challenge.firstOrNull(new Object[] {"1", "2", "3"}));
        Assertions.assertEquals("3", Challenge.lastOrNull(new Object[] {"1", "2", "3"}));
    }
}
