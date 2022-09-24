package org.object;

public class Counter {
    private final int no;

    public Counter(int no) {
        this.no = no;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(no + "빈 객체의 finallze");
    }
}
