public class NumberReverted {
    public void revert(int number) {
        int res = 0;
        while (number > 0) {
            res = (res * 10) + (number % 10);
            number /= 10;
        }
        System.out.println(res);
    }

    /*
    public static void main(String[] args) {
        System.out.println(revert(123));
        System.out.println(revert(13));
        System.out.println(revert(1));
    }
     */
}
