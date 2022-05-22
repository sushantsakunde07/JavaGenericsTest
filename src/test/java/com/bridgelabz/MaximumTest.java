package com.bridgelabz;

import org.junit.Test;
import org.junit.Assert;

public class MaximumTest {
    @Test
    public void given3Values_WhenGetMaximum_ShouldReturnCorrectValue1() {
        int finalResult = Maximum.getmaximum(9, 1, 4);
        Assert.assertEquals(9, finalResult);
    }

    @Test
    public void given3Values_WhenGetMaximum_ShouldReturnCorrectValue2() {
        int finalResult = Maximum.getmaximum(1, 9, 4);
        Assert.assertEquals(9, finalResult);
    }

    @Test
    public void given3Values_WhenGetMaximum_ShouldReturnCorrectValue3() {
        int finalResult = Maximum.getmaximum(4, 1, 9);
        Assert.assertEquals(9, finalResult);
    }

    @Test
    public void given3FloatValues_WhenGetMaximum_ShouldReturnCorrectValue1() {
        float finalResult = Maximum.getmaximum(9.6f, 1.4f, 4.4f);
        Assert.assertEquals(9.6f, finalResult, 0.0);
    }

    @Test
    public void given3FloatValues_WhenGetMaximum_ShouldReturnCorrectValue2() {
        float finalResult = Maximum.getmaximum(1.4f, 9.6f, 4.4f);
        Assert.assertEquals(9.6f, finalResult, 0.0);
    }

    @Test
    public void given3FloatValues_WhenGetMaximum_ShouldReturnCorrectValue3() {
        float finalResult = Maximum.getmaximum(4.4f, 1.4f, 9.6f);
        Assert.assertEquals(9.6f, finalResult, 0.0);
    }

    @Test
    public void given3StringValues_WhenGetMaximum_ShouldReturnCorrectValue1() {
        String finalResult = Maximum.getmaximum("apple", "peach", "banana");
        Assert.assertEquals("peach", finalResult);
    }

    @Test
    public void given3StringValues_WhenGetMaximum_ShouldReturnCorrectValue2() {
        String finalResult = Maximum.getmaximum("banana", "apple", "peach");
        Assert.assertEquals("peach", finalResult);
    }

    @Test
    public void given3StringValues_WhenGetMaximum_ShouldReturnCorrectValue3() {
        String finalResult = Maximum.getmaximum("peach", "banana", "apple");
        Assert.assertEquals("peach", finalResult);
    }
}