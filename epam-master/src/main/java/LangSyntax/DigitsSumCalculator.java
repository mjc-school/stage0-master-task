package LangSyntax;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int lasDigit = number % 10;
        int sum = 0;
        while(number != 0){
            sum = sum + lasDigit;
            number = number / 10;
            lasDigit = number % 10;
        }
        System.out.println(sum);
    }
}
