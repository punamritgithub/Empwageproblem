package com.brigelabz;

public class Empwage {
    public static final int is_full_time = 2;
    public static final int is_part_time=1;
    public static final int Employee_wage_per_Hour = 20;
    public static final int number_of_working_day = 20;

    public static void main(String[] args) {

        int emphrs = 0;
        int empwage = 0;


        int totalempwage = 0;

        for (int day = 0; day < number_of_working_day; day++) {
            int employeeAttendance = (int) Math.floor(Math.random() * 10) % 3;
            switch (employeeAttendance) {

                case is_full_time:
                    System.out.println("Employee is full time");
                    emphrs = 8;
                    break;
                case is_part_time:
                    System.out.println("Employee is part time");
                    emphrs = 4;
                    break;
                default:
                    emphrs = 0;
                    break;
            }
            empwage = emphrs * Employee_wage_per_Hour;
            System.out.println("empwage: " + empwage);

        }
        System.out.println("Total Emp Wage: " + totalempwage);
    }
}





























