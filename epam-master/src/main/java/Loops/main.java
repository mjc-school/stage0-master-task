package Loops;

public class main {
    public static void main(String[] args) {
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        //multiplicationTable.printTable(9);
        //new MultiplicationTable().printTable(100);
        new Pyramid().printPyramid(7);
        new Power().printPower(2,5);
        new HalfPyramid().printHalfPyramid(5);

        for (int i = 1; i < 5; i++){
            System.out.println(i);
            for(int j = 1; j <5; j++)
                System.out.print(j);
        }
    }
}
