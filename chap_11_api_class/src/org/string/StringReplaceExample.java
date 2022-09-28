package org.string;

public class StringReplaceExample {
    public static void main(String[] args) {
        String old = "자바는 객체지향 언어입니다. 자바 자바 자바";
        String newStr = old.replace("자바", "Java"); //target:바뀌는 거 replacement: 바꿀 거
        System.out.println(old);
        System.out.println(newStr);
    }
}
