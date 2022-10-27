package org.pattern;

import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        String regExp = "(02|010)-\\d{3,4}-\\d{4}";
        String data = "010-123-6574";
        boolean result = Pattern.matches(regExp, data);
        if (result) {
            System.out.println("일치");
        } else {
            System.out.println("불일치");
        }

        regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
        data = "angel@navercom";
        String data1 = "angel@naver.com";
        result = Pattern.matches(regExp, data);
        boolean result1 = Pattern.matches(regExp, data1);
        if (result) {
            System.out.println("일치");
        } else {
            System.out.println("불일치");
        }
        if (result1) {
            System.out.println("일치");
        } else {
            System.out.println("불일치");
        }


    }
}
