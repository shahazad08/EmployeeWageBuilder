package com.empwage;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String args[]) {
        System.out.println("Welcome to Employee Wage Builder");
        int IS_FULL_TIME=1;
        int IS_PART_TIME=2;
        int EMP_RATE_PER_HOUR=20;
        int empHours=0;
        int empWage=0;
        Random random = new Random();
        int empCheck= random.nextInt(3);
        if(empCheck== IS_FULL_TIME) {
            empHours=8;
            System.out.println("Employee is Presnet");
        }
        else if(empCheck==IS_PART_TIME) {
            empHours=4;
            System.out.println("Part time Employee");
        }
        else {
            System.out.println("Employee is Absent");
            empHours=0;
        }
        empWage=empHours*EMP_RATE_PER_HOUR;
        System.out.println("The daily wage of an employee is" +empWage);

    }
}
