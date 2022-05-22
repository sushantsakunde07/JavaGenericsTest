package com.bridgelabz;

import org.junit.Test;
import org.junit.Assert;

public class MaximumTest {

    @Test
    public void given3Values_WhenGetMaximum_ShouldReturnCorrectValue1() {
        int finalResult = Maximum.getmaximum(9, 1, 4);
        Assert.assertEquals(9, finalResult, 0);
    }

    @Test
    public void given3Values_WhenGetMaximum_ShouldReturnCorrectValue2() {
        int finalResult = Maximum.getmaximum(1, 9, 4);
        Assert.assertEquals(9, finalResult, 0);
    }

    @Test
    public void given3Values_WhenGetMaximum_ShouldReturnCorrectValue3() {
        int finalResult = Maximum.getmaximum(4, 1, 9);
        Assert.assertEquals(9, finalResult, 0);
    }
}
