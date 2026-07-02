package com.exercise;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    private StringUtils stringUtils;

    @BeforeEach
    public void setUp() {
        stringUtils = new StringUtils();
        System.out.println("setup done");
    }

    @AfterEach
    public void tearDown() {
        stringUtils = null;
        System.out.println("teardown done");
    }

    @Test
    public void testReverseString() {
        String original = "hello";
        String reversed = stringUtils.reverse(original);
        assertEquals("olleh", reversed);
    }
}
