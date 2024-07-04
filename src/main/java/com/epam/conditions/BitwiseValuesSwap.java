package com.epam.conditions;

public class BitwiseValuesSwap {

    public static void swap(int first, int second) {

        first ^= second;
        second ^= first;
        first ^= second;
    }

}
