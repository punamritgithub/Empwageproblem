package com.brigelabz;

public class Empwage {
    public static void EmployeepresentAbsent() {
        double var1 = Math.random();
        System.out.println(var1);
        double var = Math.floor(var1 * 10);
        System.out.println(var);
        int employeeAttendence = (int) var % 2;
        System.out.println(employeeAttendence);
        if (employeeAttendence == 1) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is Abesent");
        }

    }

    public static void main(String[] arg) {
        EmployeepresentAbsent();

    }
}














