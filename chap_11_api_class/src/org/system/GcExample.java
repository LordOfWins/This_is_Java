package org.system;

public class GcExample {
    public static void main(String[] args) {
        Employee emp;
        emp = new Employee(1);
        emp = null;
        emp = new Employee(2);
        emp = new Employee(3);

        System.out.println("emp.eno = " + emp.eno);
        System.gc();
    }

    static class Employee {
        public int eno;

        public Employee(int eno) {
            this.eno = eno;
            System.out.println("Employee(" + eno + ")가 메모리에 생성됨");
        }

        protected void finalize() {
            System.out.println("Employee(" + eno + ")이 메모리에서 제거됨");
        }
    }
}
