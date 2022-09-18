package org.enumeration;

public class EnumMethodExample {
    public static void main(String[] args) {
        //name() 메소드 - 문자열을 리턴한다.
        Week today = Week.SATURDAY;
        String name = today.name();
        System.out.println(name);

        //ordinal 메소드 - 전체 열거 객체 중 몇 번째 열거 객체인지 알려준다.
        int ordinal = today.ordinal();
        System.out.println(ordinal);

        //compareTo 메소드 - 매개값으로 주어진 열거 객체를 기준으로 전후에 몇 번째 위치하는지 알려준다.
        Week day1 = Week.MONDAY;
        Week day2 = Week.WEDNESDAY;
        int result1 = day1.compareTo(day2);
        int result2 = day2.compareTo(day1);
        System.out.println(result1);
        System.out.println(result2);

        //valueOf 매개값과 동인한지 여부를 알려준다.
        if (args.length == 1) {
            String strDay = args[0];
            Week week = Week.valueOf(strDay);
            if (week == Week.SATURDAY || week == Week.SUNDAY) {
                System.out.println("주말이군요");
            } else {
                System.out.println("평일 이군요");
            }
        }

        //values 열거 객체들을 배열로 만들어 리턴한다.
        Week[] days = Week.values();
        for (Week day : days) {
            System.out.println(day);
        }
    }
}
