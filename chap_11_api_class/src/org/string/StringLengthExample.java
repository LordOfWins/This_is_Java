package org.string;

public class StringLengthExample {
    public static void main(String[] args) {
        String ssn = "7306241230123";
        int length = ssn.length();
        if (length == 13) {
            System.out.println("맞아");
        } else {
            System.out.println("아니야");
        }
    }
}
