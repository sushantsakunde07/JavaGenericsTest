package com.bridgelabz;

public class Maximum<E extends Comparable> {
    E value1,value2,value3;

    public Maximum(E value1, E value2, E value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }
    public E testMaximum(){
        E testMax= testMaximum(value1,value2,value3);
        return  testMax;
    }

    public static <E extends Comparable> E testMaximum(E value1, E value2, E value3) {
        E max = value1;
        if (value2.compareTo(value1) > 0 && value2.compareTo(value3) > 0)
            max = value2;
        else if (value3.compareTo(value2) > 0 && value3.compareTo(value1) > 0)
            max = value3;
        System.out.println(max);
        return max;
    }
}