package org.exercise;

public class Bank {
    private final String ano; //계좌번호
    private final String owner; //계좌주
    private int balance; //잔액

    public Bank(String ano, String owner, int balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAno() {
        return ano;
    }


    public String getOwner() {
        return owner;
    }


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
