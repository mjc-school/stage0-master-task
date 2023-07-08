package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide + secondSide > thirdSide && firstSide + thirdSide > secondSide && secondSide + thirdSide > firstSide) {
            System.out.println("this is valid triangle");
        } else {
            System.out.println("It's not a triangle");
        }
    }

}
