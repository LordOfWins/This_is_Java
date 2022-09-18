package org.example;

public class Example8 {
    public static void main(String[] args) {
        int[][] array = {{95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}};
        int sum = 0;
        double avg;
        for (int[] ints : array) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        avg = (double) sum / 10;
        System.out.println("sum: " + sum);
        System.out.println("avg: " + avg);
    }
}
