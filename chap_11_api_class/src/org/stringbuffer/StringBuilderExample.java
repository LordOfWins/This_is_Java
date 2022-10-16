package org.stringbuffer;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Java ");
        sb.append("Program Study"); //Java Program Study
        System.out.println(sb);

        sb.insert(4, "2");
        System.out.println(sb); //Java2 Program Study

        sb.setCharAt(4, '6');
        System.out.println(sb); //Java6 Program Study

        sb.replace(6, 13, "Book");
        System.out.println(sb); //Java6 Book Study

        sb.delete(4, 5);
        System.out.println(sb); //Java Book Study

        int length = sb.length(); //15
        System.out.println("총 문자수: " + length);

        String result = sb.toString();
        System.out.println(result); //Java Book Study
    }
}
