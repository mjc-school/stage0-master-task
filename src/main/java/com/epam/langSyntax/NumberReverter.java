package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        String str = String.valueOf(number);
        StringBuilder reverted = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverted.append(str.charAt(i));
        }

        System.out.println(reverted.toString());
    }
}
