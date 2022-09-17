package org.doubleoperation;

public class InputDataCheckNaNExample1 {
    public static void main(String[] args) {
        String userInput = "NaN";
        double val = Double.parseDouble(userInput);
        double currentBalance = 10000.0;
        currentBalance += val;
        System.out.println(currentBalance);
    }
}
