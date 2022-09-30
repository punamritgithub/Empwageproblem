package com.brigelabz;

public class Empwage {
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;

    static final int EMP_RATE_PER_HRS = 20;

    public static void main(String[] arg) {

        int emphrs = 0;
        int empwage = 0;
        int employeeAttendance = (int) Math.floor(Math.random() * 10) % 3;
        System.out.println("employeeAttendance");

        if (employeeAttendance == 2) {
            switch (employeeAttendance) {
                case IS_FULL_TIME:
                    System.out.println("Employee is full time");
                    emphrs = 8;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee is part time");
                    emphrs = 4;
                    break;
                default:
                    System.out.println("Employee is absent");


            }
            empwage = emphrs * EMP_RATE_PER_HRS;
            System.out.println("empwage: " + empwage);

        }
    }
}





























