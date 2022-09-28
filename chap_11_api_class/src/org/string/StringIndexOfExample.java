package org.string;

public class StringIndexOfExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";
        int location = subject.indexOf("프로그래밍");

        System.out.println(location); //3 프로그래밍이 자바 프로그래밍에서 3번째 위치에서 나오기 때문이다.

        if (subject.indexOf("자바") != -1) {
            System.out.println("자바 관련");
        } else {
            System.out.println("관련 없음");
        }
    }
}
