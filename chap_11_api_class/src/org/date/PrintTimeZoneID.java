package org.date;

import java.util.TimeZone;

public class PrintTimeZoneID {
    public static void main(String[] args) {
        String[] availableIDs = TimeZone.getAvailableIDs(); //가능한 타임존 얻기
        for (String id : availableIDs) {
            System.out.println(id);
        }
    }
}
