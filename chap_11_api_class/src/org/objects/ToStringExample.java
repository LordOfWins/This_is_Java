package org.objects;

import java.util.Date;
import java.util.Objects;

public class ToStringExample {
    public static void main(String[] args) {
        Object obj = new Object();
        Date obj2 = new Date();
        System.out.println(obj);
        System.out.println(obj2);

        String str1 = "홍길동";
        String str2 = null;
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println(Objects.toString(str2, "이름이 없어요"));

    }
}
