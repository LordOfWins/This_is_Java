package org.string;

public class StringCharAtExample {
    public static void main(String[] args) {
        String ssn = "010624-1230123";
        char sex = ssn.charAt(7);
        switch (sex) {
            case '1', '3' -> System.out.println("남자입니다");
            case '2', '4' -> System.out.println("여자입니다.");
        }
    }
}
