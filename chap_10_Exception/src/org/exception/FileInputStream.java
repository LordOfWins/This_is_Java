package org.exception;

public class FileInputStream implements AutoCloseable {
    private final String file;

    public FileInputStream(String file) {
        this.file = file;
    }

    public void read() {
        System.out.println(file + "을 읽습니다");
    }

    @Override
    public void close() {
        System.out.println(file + "을 닫습니다.");
    }
}
