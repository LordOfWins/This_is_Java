package org.object;

public class Member implements Cloneable {
    public String id;
    public String name;
    public String password;
    public int age;
    public boolean adult;

    public Member(String id, String name, String password, int age, boolean adult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.adult = adult;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member member) {
            return id.equals(member.id);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone();
        } catch (CloneNotSupportedException e) {
        }
        return cloned;
    }
}
