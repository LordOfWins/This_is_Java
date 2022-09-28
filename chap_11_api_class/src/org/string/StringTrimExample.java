package org.string;

public class StringTrimExample {
    public static void main(String[] args) {
        String tel1 = "    02 ";
        String tel2 = "123    ";
        String tel3 = "    1234    ";

        String tel = tel1.trim() + tel2.trim() + tel3.trim(); //공백을 제거하고 연결
        System.out.println(tel);
    }
}
