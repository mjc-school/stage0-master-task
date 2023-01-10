package Conditions;

public class TriangleValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if( firstSide  <= 0 || secondSide  <= 0 || thirdSide <= 0)
        System.out.println("Not a valid input");
        //In theory a triangle can be however large or small as possible. That's why we are using Doubles Max value.
        if( firstSide  > Double.MAX_VALUE || secondSide  > Double.MAX_VALUE || thirdSide > Double.MAX_VALUE)
            System.out.println("Not a valid input");
        else System.out.println("Its a valid triangle");
    }
}
