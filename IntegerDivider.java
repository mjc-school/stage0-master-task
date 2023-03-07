public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int res = dividend / divider;
        if (res * divider == dividend) {
            System.out.println("can be divided completely");
        } else {
            System.out.println("cannot be divided completely");
        }
    }

    /*
    public static void main(String[] args) {
        printCompletelyDivided(12, 3);
    }
     */
}
