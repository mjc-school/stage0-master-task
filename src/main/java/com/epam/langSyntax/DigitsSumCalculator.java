package com.epam.langSyntax;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        // 3241
        int[] nums = new int[4];

        int index = 0;
        while (number != 0) {
            int digit = number % 10;
            nums[index] = digit;
            number /= 10;
            index += 1;
        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println(sum);
    }

}

