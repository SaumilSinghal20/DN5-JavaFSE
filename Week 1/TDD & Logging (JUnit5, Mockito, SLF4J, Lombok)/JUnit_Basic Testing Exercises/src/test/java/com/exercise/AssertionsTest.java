package com.exercise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    public void testVariousAssertions() {
        assertEquals(10, 5 + 5);
        assertTrue(10 > 5);
        assertFalse(10 < 5);
        
        Object obj = null;
        assertNull(obj);
        
        Object obj2 = new Object();
        assertNotNull(obj2);
    }
}
