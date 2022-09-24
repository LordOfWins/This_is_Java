package org.object;

public class Key {
    public int number;

    @Override
    public int hashCode() {
        return number;
    }

    public Key(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Key compareKey) {
            return this.number == compareKey.number;
        }
        return false;
    }
}
