package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Example9 {
    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings("DM_DEFAULT_ENCODING")
    public static void main(String[] args) {
        int studentNum = 0;
        int[] scores = null;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("_____________________________________________________");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4.분석 | 5.종료);");
            System.out.println("_____________________________________________________");
            System.out.print("선택> ");
            int select = scanner.nextInt();
            if (select == 1) {
                System.out.print("학생수> ");
                studentNum = scanner.nextInt();
                scores = new int[studentNum];
            } else if (select == 2) {
                for (int i = 0; i < Objects.requireNonNull(scores).length; i++) {
                    System.out.print("scores[" + i + "]>");
                    scores[i] = scanner.nextInt();
                }
            } else if (select == 3) {
                for (int score : Objects.requireNonNull(scores)) {
                    System.out.println("scores[i]: " + score);
                }
            } else if (select == 4) {
                int max = 0;
                int sum = 0;
                for (int num : Objects.requireNonNull(scores)) {
                    sum += num;
                    if (num > max) {
                        max = num;
                    }
                }
                System.out.println("최고 점수: " + max);
                if (studentNum != 0) {
                    System.out.println("평균 점수: " + (double) sum / studentNum);
                }
            } else if (select == 5) {
                break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
