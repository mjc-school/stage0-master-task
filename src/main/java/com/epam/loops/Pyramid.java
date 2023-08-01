package com.epam.loops;

import java.util.ArrayList;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        if (cathetusLength > 0) {
            ArrayList<StringBuilder> floors = new ArrayList<>();
            StringBuilder floor = new StringBuilder("1");
            floors.add(floor);
            for (int i = 2; i <= cathetusLength; i++) {
                StringBuilder nextFloor = new StringBuilder();
                nextFloor.append(i).append(floor).append(i);
                floors.add(nextFloor);
                floor = nextFloor;
            }
            for (int i = 0; i < floors.size(); i++) {
                StringBuilder floorToPrint = floors.get(i);
                while (floorToPrint.length() < cathetusLength + i) {
                    floorToPrint.insert(0, " ");
                }
                System.out.println(floorToPrint);
            }
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
