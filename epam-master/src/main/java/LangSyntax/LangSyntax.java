package LangSyntax;


public class LangSyntax {
    public static void main(String[] args) {
        DigitsSumCalculator sum = new DigitsSumCalculator();
        revert(1234);
        sum.calculateSum(23234);



    }
        public static void revert(int number) {
           int reversed = 0;

            System.out.println("Original Number: " + number);

            // run loop until number becomes 0
            while(number != 0) {

                // get last digit from number
                int digit = number % 10;
                reversed = reversed * 10 + digit;

                // remove the last digit from number
                number /= 10;
            }

            System.out.println("Reversed Number: " + reversed);
        }
        }


