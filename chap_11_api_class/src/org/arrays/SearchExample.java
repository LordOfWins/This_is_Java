package org.arrays;

import java.util.Arrays;

public class SearchExample { //배열 항목 검색
    public static void main(String[] args) {
        //기본 타입 값 검색
        int[] scores = {99, 97, 98};
        Arrays.sort(scores); //[97, 98, 99]
        int index = Arrays.binarySearch(scores, 99);
        System.out.println("찾은 인덱스: " + index);

        //문자열 검색
        String[] names = {"홍길동", "박동수", "김민수"};
        Arrays.sort(names); //["김민수", "박동수", "홍길동"]
        index = Arrays.binarySearch(names, "홍길동");
        System.out.println("찾은 인덱스: " + index);

        //객체 검색
        Member m1 = new Member("홍길동");
        Member m2 = new Member("박동수");
        Member m3 = new Member("김민수");
        Member[] members = {m1, m2, m3};
        Arrays.sort(members);
        index = Arrays.binarySearch(members, m1);
        System.out.println("찾은 인덱스: " + index);
    }
}
