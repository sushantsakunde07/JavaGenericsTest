package com.bridgelabz;


import org.junit.Test;
import org.junit.Assert;

public class MaximumTest {
    @Test
    public void given3StringValues_WhenGetMaximum_ShouldReturnCorrectValue1() {
        String finalResult = Maximum.getmaximum("apple", "peach", "banana");
        Assert.assertEquals("peach", finalResult);
    }

    @Test
    public void given3StringValues_WhenGetMaximum_ShouldReturnCorrectValue2() {
        String finalResult = Maximum.getmaximum("apple", "watermelon", "banana");
        Assert.assertEquals("watermelon", finalResult);
    }

    @Test
    public void given3StringValues_WhenGetMaximum_ShouldReturnCorrectValue3() {
        String finalResult = Maximum.getmaximum("apple", "peach", "banana");
        Assert.assertEquals("peach", finalResult);
    }
}