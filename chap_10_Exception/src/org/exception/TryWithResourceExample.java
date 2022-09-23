package org.exception;

import java.io.IOException;

public class TryWithResourceExample {
    public static void main(String[] args) {
        try (FileInputStream stream = new FileInputStream("file.txt")) {
            stream.read();
            throw new IOException();
        } catch (Exception e) {
            System.out.println("예외 처리 코드가 실행 되었습니다.");
        }
    }
}
