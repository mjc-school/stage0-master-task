public class TriangleValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide + secondSide <= thirdSide || firstSide + thirdSide <= secondSide || secondSide + thirdSide <= firstSide) {
            System.out.println("it's not a triangle");
        } else {
            System.out.println("this is a valid triangle");
        }
    }

    /*
    public static void main(String[] args) {
        validate(1, 10, 12);
    }
     */
}
