package org.example;

public class Example7 {
    public static void main(String[] args) {
        int max = 0;
        int[] array = {1, 5, 3, 8, 2};
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("max: " + max);
    }
}
