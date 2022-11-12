package org.format;

import java.text.DecimalFormat;

public class DecimalFormatExample {
    public static void main(String[] args) {
        double num = 123456.78;
        DecimalFormat df = new DecimalFormat("0");
        System.out.println(df.format(num)); //123456.78

        df = new DecimalFormat("0.0");
        System.out.println(df.format(num));

        df = new DecimalFormat("00000000000.00000");
        System.out.println(df.format(num));

        df = new DecimalFormat("#");
        System.out.println(df.format(num)); //123457

        df = new DecimalFormat("#.#");
        System.out.println(df.format(num)); //123456.8

        df = new DecimalFormat("######.#####");
        System.out.println(df.format(num)); //123456.78

        df = new DecimalFormat("#.0000"); //소수점
        System.out.println(df.format(num)); //123456.7800

        df = new DecimalFormat("+#.0000"); //양수 기호
        System.out.println(df.format(num)); //+123456.7800

        df = new DecimalFormat("-#.00000"); //음수
        System.out.println(df.format(num)); //-123456.78000

        df = new DecimalFormat("#,###.0"); // 단위 구분
        System.out.println(df.format(num)); //123,456.8

        df = new DecimalFormat("0.0E0"); //지수 문자
        System.out.println(df.format(num)); //1.2E5

        df = new DecimalFormat("+#,### ; -#,###"); //음수, 양수 모두 기술
        System.out.println(df.format(num)); //+123,457

        df = new DecimalFormat("#.# %"); //100울 곱한 후 %를 붙임
        System.out.println(df.format(num)); //12345678 %

        df = new DecimalFormat("\u00A4 #,###"); //통화 기호
        System.out.println(df.format(num)); //₩ 123,457

    }
}
