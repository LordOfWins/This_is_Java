package org.doubleOperation;

public class InputDataCheckNaNExample2 {
    public static void main(String[] args) {
        String userInput = "NaN";
        double val = Double.valueOf(userInput);
        double currentBalance = 10000.0;

        //악의적인 사용자가 있을 수 있으므로 NaN 검사를 해줘야 한다.
        if (Double.isNaN(val)) {
            System.out.println("NaN이 입력되어 처리할 수 없음");
            val = 0.0;
        }

        currentBalance += val;
        System.out.println(currentBalance);
    }
}
