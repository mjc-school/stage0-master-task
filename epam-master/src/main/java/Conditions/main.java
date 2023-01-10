package Conditions;

public class main {
    public static void main(String[] args) {
        TriangleValidator triangleValidator = new TriangleValidator();
        triangleValidator.validate(2.0,3253362432.0,0.000000001);

        SeasonDeterminer seasonDeterminer = new SeasonDeterminer();
        seasonDeterminer.tellTheSeason(1);

        DaysInMonth daysInMonth = new DaysInMonth();
        daysInMonth.printDays(2000,2);

        IntegerDivider integerDivider = new IntegerDivider();
        integerDivider.printCompletelyDivided(8,2);

        CoordinatePane coordinatePane = new CoordinatePane();
        coordinatePane.printQuadrant(1,-4);

        BitwiseValuesSwap bitwiseValuesSwap = new BitwiseValuesSwap();
        bitwiseValuesSwap.swap(4,6);


    }
}
