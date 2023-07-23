package com.epam.langSyntax;

import com.epam.OOP.Bird;

class Main {
    public static void main(String[] args) {
        NumberReverter n = new NumberReverter();
        n.revert(489);
    }
}


public class NumberReverter {
    public int reversedNumber;
    public void revert(int number) {

        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        this.reversedNumber = reversed;
    }

}
