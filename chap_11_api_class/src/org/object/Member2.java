package org.object;

import java.util.Arrays;

public class Member2 implements Cloneable {
    public String name;
    public int age;
    public int[] scores;
    public Car car;

    public Member2(String name, int age, int[] scores, Car car) {
        this.name = name;
        this.age = age;
        this.scores = scores;
        this.car = car;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //먼저 얕은 복사로 name, age를 복제
        Member2 cloned = (Member2) super.clone();
        //scores를 깊은 복제
        cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
        //car를 깊은 복제한다.
        cloned.car = new Car(this.car.model);
        //깊은 복제되 Member객체를 리턴
        return cloned;
    }

    public Member2 getMember() {
        Member2 cloned = null;
        try {
            cloned = (Member2) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloned;
    }
}
