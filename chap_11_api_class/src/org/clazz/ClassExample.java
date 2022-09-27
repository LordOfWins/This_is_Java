package org.clazz;


import org.object.Car;

public class ClassExample {
    public static void main(String[] args) {
        Car car = new Car("");
        Class clazz = car.getClass();
        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getPackage().getName());
        System.out.println();

        try {
            Class clazz2 = Class.forName("org.object.Car");
            System.out.println(clazz2.getName());
            System.out.println(clazz2.getSimpleName());
            System.out.println(clazz2.getPackage().getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
