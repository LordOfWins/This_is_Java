package org.singleoperation;

public class BitReverseOperationExample {
    public static void main(String[] args) {
        int v1 = 10;
        int v2 = -v1;
        int v3 = -v1 + 1;
        System.out.println(toBinaryString(v1) + "(십진수1: " + v1 + ")");
        System.out.println(toBinaryString(v2) + "(십진수2: " + v2 + ")");
        System.out.println(toBinaryString(v3) + "(십진수3: " + v3 + ")");
        System.out.println();

        int v4 = -10;
        int v5 = -v4;
        int v6 = -v4 + 1;
        System.out.println(toBinaryString(v4) + "(십진수4: " + v4 + ")");
        System.out.println(toBinaryString(v5) + "(십진수5: " + v5 + ")");
        System.out.println(toBinaryString(v6) + "(십진수6: " + v6 + ")");
    }

    private static StringBuilder toBinaryString(int value) {
        StringBuilder str = new StringBuilder(Integer.toBinaryString(value));
        while (str.length() < 32) {
            str = new StringBuilder("0" + str);
        }
        return str;
    }
}


