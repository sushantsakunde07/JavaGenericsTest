package com.bridgelabz;

import org.junit.Test;
import org.junit.Assert;

public class MaximumTest {
    @Test
    public void given3FloatValues_WhenGetMaximum_ShouldReturnCorrectValue1() {
        float finalResult = Maximum.getmaximum(9.4f, 1.4f, 4.4f);
        Assert.assertEquals(9.4f, finalResult, 0.0);
    }

    @Test
    public void given3FloatValues_WhenGetMaximum_ShouldReturnCorrectValue2() {
        float finalResult = Maximum.getmaximum(1.4f, 9.7f, 4.4f);
        Assert.assertEquals(9.7f, finalResult, 0.0);
    }

    @Test
    public void given3FloatValues_WhenGetMaximum_ShouldReturnCorrectValue3() {
        float finalResult = Maximum.getmaximum(9.6f, 1.4f, 4.4f);
        Assert.assertEquals(9.6f, finalResult, 0.0);
    }
}