package org.math;

public class MathExample {
    public static void main(String[] args) {
        //절댓값 abs
        int v1 = Math.abs(-5);
        double v2 = Math.abs(-3.14);
        System.out.println("v1=" + v1);
        System.out.println("v2=" + v2);

        //올림 ceil
        double v3 = Math.ceil(5.3);
        double v4 = Math.ceil(-5.3);
        System.out.println("v3=" + v3);
        System.out.println("v4=" + v4);

        //버림 floor
        double v5 = Math.floor(5.3);
        double v6 = Math.floor(-5.3);
        System.out.println("v5=" + v5);
        System.out.println("v6=" + v6);

        //둘 중 큰 거 비교 max
        int v7 = Math.max(5, 9);
        double v8 = Math.max(5.3, 2.5);
        System.out.println("v7=" + v7);
        System.out.println("v8=" + v8);

        //둘 중 작은 값 비교 min
        int v9 = Math.min(5, 9);
        double v10 = Math.min(5.3, 2.5);
        System.out.println("v9=" + v9);
        System.out.println("v10=" + v10);

        //랜덤값 random
        double v11 = Math.random();
        System.out.println("v11=" + v11);

        //근접한 정수 rint
        double v12 = Math.rint(5.3);
        double v125 = Math.rint(5.5); //6.0
        double v13 = Math.rint(5.7);
        System.out.println("v12=" + v12);
        System.out.println("v125=" + v125);
        System.out.println("v13=" + v13);

        //반올림 round
        long v14 = Math.round(5.3);
        long v15 = Math.round(5.7);
        System.out.println("v14=" + v14);
        System.out.println("v15=" + v15);


        double value = 12.3456;
        double temp1 = value * 100; //1234.56
        long temp2 = Math.round(temp1); //반올림 해서 1235(정수 형이라서)
        double v16 = temp2 / 100.0;
        System.out.println("v16=" + v16);


    }
}
