package com.epam.conditions;

public class BitwiseValuesSwap {

    public static int getBitsSize(int a){
        int sum = 0;

        while (a != 0){
            a/=2;
            sum+=1;
        }

        return sum;
    }

    public static void swap(int first, int second) {

        first ^= second;
        second ^= first;
        first ^= second;
    }

}
