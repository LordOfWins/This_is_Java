package org.system;

public class ExitExample {
    public static void main(String[] args) {
        //보안 관리자 설정
        System.setSecurityManager(new SecurityManager() {
            @Override
            public void checkExit(int status) {
                if (status != 5) {
                    throw new SecurityException();
                }
            }
        });
        for (int i = 0; i < 10; i++) {
            //i 값 출력
            System.out.println(i);
            try {
                System.exit(i);
            } catch (SecurityException e) {

            }
        }
    }
}
