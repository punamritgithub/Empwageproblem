package com.brigelabz;

public class Empwage {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        int Employee_wage_per_Hour = 20;
        int empHrs = 0;
        int empwage = 0;
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == IS_FULL_TIME)
            empHrs = 8;
        else
            empHrs = 0;


        empwage = empHrs * Employee_wage_per_Hour;
        System.out.println("empwage: " + empwage);
    }
}




















