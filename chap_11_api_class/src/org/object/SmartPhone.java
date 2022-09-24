package org.object;

public class SmartPhone {
    private final String company;
    private final String os;

    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }

    @Override
    public String toString() {
        return company + "," + os;
    }
}
