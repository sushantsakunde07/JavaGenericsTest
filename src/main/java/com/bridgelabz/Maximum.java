package com.bridgelabz;


public class Maximum {
    public static Integer getmaximum(Integer a, Integer b, Integer c) {
        Integer max = a;
        if (b.compareTo(max) > 0 && b.compareTo(c) > 0)
            max = b;
        else if (c.compareTo(max) > 0)
            max = c;
        System.out.println(max);
        return max;
    }
}