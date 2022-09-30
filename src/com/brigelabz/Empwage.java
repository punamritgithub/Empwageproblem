package com.brigelabz;

public class Empwage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_TIME_HOUR = 8;
    static final int PART_TIME_HOUR = 4;



    public static void main(String[]args) {
        double var1 = Math.random();
        System.out.println(var1);
        double var = Math.floor(var1 * 10);
        System.out.println(var);
        int employeeAttendence = (int) var % 3;
        System.out.println(employeeAttendence);
        int dailyWage = 0;
        if (employeeAttendence == 2) {
            System.out.println("Employee is Full time");
            dailyWage = WAGE_PER_HOUR * FULL_TIME_HOUR;
        } else if (employeeAttendence == 1) {
            System.out.println("Employee is Part time");
            dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
        } else {
            System.out.println("Employee is Absent");
        }
        System.out.println("Daily Wage => " + dailyWage);
    }
}

























