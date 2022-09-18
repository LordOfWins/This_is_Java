package org.enumeration;

import java.util.Calendar;

public class EnumWeekExample {
    public static void main(String[] args) {
        Week today = null;
        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);
        switch (week) {
            case 1 -> today = Week.SUNDAY;
            case 2 -> today = Week.MONDAY;
            case 3 -> today = Week.TUESDAY;
            case 4 -> today = Week.WEDNESDAY;
            case 5 -> today = Week.THURSDAY;
            case 6 -> today = Week.FRIDAY;
            case 7 -> today = Week.SATURDAY;
            default -> System.out.println("없음");
        }
        System.out.println("오늘 요일: " + today);
        if (today == Week.SUNDAY) {
            System.out.println("일요일에는 축구를 합니다");
        } else {
            System.out.println("열심히 자바 공부를 합니다.");
        }
    }
}
