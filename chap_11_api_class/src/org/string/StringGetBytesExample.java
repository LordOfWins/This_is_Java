package org.string;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class StringGetBytesExample {
    public static void main(String[] args) {
        String str = "안녕하세요";
        byte[] bytes = str.getBytes();
        System.out.println("bytes.length = " + bytes.length);

        String str1 = new String(bytes);
        System.out.println("bytes->String: " + str1);

        try {
            byte[] bytes2 = str.getBytes("EUC-KR");
            System.out.println(bytes2.length);
            String str2 = new String(bytes2, "EUC-KR");
            System.out.println(str2);

            byte[] bytes3 = str.getBytes(StandardCharsets.UTF_8);
            System.out.println(bytes3.length);
            String str3 = new String(bytes3, StandardCharsets.UTF_8);
            System.out.println(str3);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
