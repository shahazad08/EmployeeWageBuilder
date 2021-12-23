package com.empwage;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String args[]) {
        System.out.println("Welcome to Employee Wage Builder");
        int IS_PRESENT=1;
        Random random = new Random();
        int empCheck= random.nextInt(2);
        if(empCheck== IS_PRESENT) {
            System.out.println("Employee is Presnet");
        }
        else {
            System.out.println("Employee is Absent");
        }
    }
}
