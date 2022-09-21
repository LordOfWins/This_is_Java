package org.exercise;

import java.util.Objects;
import java.util.Scanner;

public class BankApplication {
    private static final Bank[] banks = new Bank[5];
    private static final Scanner scanner = new Scanner(System.in);
    static int cnt = 0;

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("--------------------------------------------------------");
            System.out.println("1.게좌생성 | 2.계좌목록 | 3.계좌삭제 | 4.예금 | 5.출금 | 6.종료");
            System.out.println("--------------------------------------------------------");
            System.out.print("선택> ");

            int selectNo = scanner.nextInt();

            switch (selectNo) {
                case 1 -> createAccount();
                case 2 -> bankList();
                case 3 -> delete();
                case 4 -> deposit();
                case 5 -> withdraw();
                case 6 -> run = false;
                default -> System.out.println("올바른 번호로 입력해주세요");
            }
        }
        System.out.println("프로그램 종료");
    }

    private static void createAccount() {
                if (cnt == banks.length) {
                    System.out.println("계좌가 다 찼습니다.");
                    return;
                }
        System.out.println("--------");
        System.out.println("계좌생성");
        System.out.println("--------");
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("계좌주: ");
        String owner = scanner.next();
        System.out.print("초기입금액: ");
        int balance = scanner.nextInt();
        //i=0번째에서 99번째까지 100번실행
        for (int i = 0; i < banks.length; i++) {
            //i번째 값이 비어있다면
            if (banks[i] == null) {
                banks[i] = new Bank(ano, owner, balance);
                cnt++;
                //j=0에서 j=1까지
                for (int j = 0; j < i; j++) {
                    //i가 2라면 i+1이 3이니까 j는 전체를 봄
                    if (banks[i].getAno().equals(banks[j].getAno())) {
                        System.out.println("계좌가 이미 있습니다");
                        banks[i] = null;
                        cnt--;
                        return;
                    }
                }
                System.out.println("계좌가 생성되었습니다.");
                break;
            }
        }
    }

    private static void bankList() {
        System.out.println("--------");
        System.out.println("계좌목록");
        System.out.println("--------");
        //계좌 있는 것 다 출력하기
        for (Bank bank : banks) {
            if (bank == null) continue;
            System.out.println(bank.getAno() + "\t" + bank.getOwner() + "\t" + bank.getBalance());
        }
    }

    private static void delete() {
        System.out.println("--------");
        System.out.println("계좌삭제");
        System.out.println("--------");
        System.out.println("계좌를 삭제할 번호를 입력하세요");
        System.out.print("계좌 번호: ");
        //계좌 번호 입력받기
        String ano = scanner.next();
        Bank temp;
        for (int i = 0; i < banks.length; i++) {
            if (!Objects.equals(ano, banks[i].getAno())) {
                continue;
            }
            banks[i] = null;
            System.out.println("삭제 되었습니다.");
            cnt--;
            for (int j = i+1; j <=banks.length-1; j++) {
                temp = banks[j];
                banks[j] = banks[i];
                banks[i] = temp;
                i++;
            }

            return;
        }
    }

    private static void deposit() {
        System.out.println("--------");
        System.out.println("예금");
        System.out.println("--------");
        System.out.print("게좌번호: ");
        String ano = scanner.next();
        //계좌번호를 입력 받고 맞는 계좌에 넣기
        System.out.print("예금액: ");
        int money = scanner.nextInt();
        Bank bank = findAccount(ano);
        if (bank == null) {
            System.out.println("결과: 계좌가 존재하지 않습니다.");
            return;
        }

        // 총 값을 계좌에 넣기
        bank.setBalance(bank.getBalance() + money);
        System.out.println("결과: 예금이 성공되었습니다.");
    }

    private static void withdraw() {
        System.out.println("--------");
        System.out.println("출금");
        System.out.println("--------");
        System.out.print("게좌번호: ");
        findAccount(scanner.next());
        System.out.print("출금액: ");
        int withdraw = scanner.nextInt();
        for (Bank bank : banks) {
            if (bank.getBalance() < withdraw) {
                System.out.println("계좌 잔액을 확인해주세요");
                return;
            }
            int totalBalance = bank.getBalance() - withdraw;
            bank.setBalance(totalBalance);
            System.out.println("결과: 출금이 성공되었습니다.");
        }
        //현재 계좌의 값을 인출하기
    }

    private static Bank findAccount(String ano) {
        Bank bank = null;
        for (Bank value : banks) {
            if (value != null && (value.getAno().equals(ano))) {
                bank = value;
                break;

            }
        }
        return bank;
    }
}
