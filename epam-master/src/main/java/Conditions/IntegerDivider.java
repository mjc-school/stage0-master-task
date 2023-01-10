package Conditions;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int result = dividend / divider;
        int checkResult = result * divider;
        if (dividend == 0 || divider == 0){
            System.out.println("Division by zero");
        }
        if(dividend == checkResult)
            System.out.println("Can be divided completely");
        else System.out.println("Cannot be divided completely");
    }
    }
