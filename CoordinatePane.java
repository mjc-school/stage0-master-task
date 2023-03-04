public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println("first");
        } else if (x < 0 && y > 0) {
            System.out.println("second");
        } else if (x < 0 && y < 0) {
            System.out.println("third");
        } else if (x > 0 && y < 0) {
            System.out.println("fourth");
        } else
            System.out.println("zero");
        }

    /*
    public static void main(String[] args) {
        int[] x = {-1, 1, -1, 1, 0};
        int[] y = {-1, 1, 1, 0, 0};
        for (int i = 0; i < x.length; i++) {
            printQuadrant(x[i], y[i]);
        }
    }
    */
}
