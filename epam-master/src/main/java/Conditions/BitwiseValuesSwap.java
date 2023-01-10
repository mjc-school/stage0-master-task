package Conditions;

public class BitwiseValuesSwap {
    //Implement the program that will swap 2 variables
    // without creating new variables or objects, using bitwise operators:
    public void swap(int first, int second) {
        //using the XOR operator
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;
        System.out.println("After swapping: " +"first = " + first + ". second = " + second);

    }
}
