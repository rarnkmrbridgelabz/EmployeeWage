package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {
    static final int FULL_TIME_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int EMP_FULL_TIME = 1;
    static final int EMP_PART_TIME = 2;

    public void calculateEmployeeWage(String company, int wagePerHour, int workingDay, int totalWorkHrs) {

        int empWage = 0;
        int totalWage = 0;
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;

        while (totalWorkingDays < workingDay && totalWorkingHours < totalWorkHrs ) {

            Random random = new Random();
            int empPresent = random.nextInt(3);
            System.out.println("Random Value for Employee Attendance is :" + empPresent);

            int x;
            switch (empPresent) {
                case EMP_FULL_TIME:
                    x = wagePerHour * FULL_TIME_HOUR;
                    empWage = empWage + x;
                    totalWorkingHours = totalWorkingHours + FULL_TIME_HOUR;
                    System.out.println("Employee is present and the wage is : " + empWage);
                    totalWorkingDays++;
                    break;

                case EMP_PART_TIME:
                    x = wagePerHour * PART_TIME_HOUR;
                    empWage = empWage + x;
                    totalWorkingHours = totalWorkingHours + PART_TIME_HOUR;
                    System.out.println("Employee is Part time present and the wage is : " + empWage);
                    totalWorkingDays++;
                    break;


                default:
                    System.out.println("Employee is absent and the wage is : " + empWage);
                    break;

            }

        }

        System.out.println("Total Working Days :" +totalWorkingDays);
        System.out.println("Total Working Hours :" +totalWorkHrs);
        System.out.println("Total Employee Wage for company "+ company +" is :" + empWage);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage calculation");
        EmployeeWage emp = new EmployeeWage();
        emp.calculateEmployeeWage("COM1",40,22,140);
        System.out.println("--------------------------------------------");
        emp.calculateEmployeeWage("COM2",90,21,222);
        System.out.println("--------------------------------------------");
        emp.calculateEmployeeWage("COM3",58,22,175);
        System.out.println("--------------------------------------------");

    }
}
}


