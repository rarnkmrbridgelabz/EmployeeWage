package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {
    static final int EMP_FULL_TIME = 1;
    static final int EMP_PART_TIME = 2;

    public String company;
    public int wagePerHour;
    public int workingDay;
    public int totalWorkHrs;

    public EmployeeWage(String company, int wagePerHour, int workingDay, int totalWorkHrs) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.workingDay = workingDay;
        this.totalWorkHrs = totalWorkHrs;
    }

    public void calculateEmpWage(){

        int empWage = 0;
        int totalWage = 0;
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;

        while (totalWorkingDays < workingDay && totalWorkingHours < totalWorkHrs) {

            Random random = new Random();
            int empPresent = random.nextInt(3);
            System.out.println("Random Value for Employee Attendance is :" + empPresent);

            int x;
            switch (empPresent) {

                case EMP_FULL_TIME:

                    x = wagePerHour * 8;
                    empWage = empWage + x;
                    totalWorkingHours = totalWorkingHours + 8;
                    System.out.println("Employee is present and the wage is : " + empWage);
                    totalWorkingDays++;
                    break;

                case EMP_PART_TIME:
                    x = wagePerHour * 4;
                    empWage = empWage + x;
                    totalWorkingHours = totalWorkingHours + 4;
                    System.out.println("Employee is Part time present and the wage is : " + empWage);
                    totalWorkingDays++;
                    break;


                default:
                    System.out.println("Employee is absent and the wage is : " + empWage);
                    break;

            }

        }

        System.out.println("Total Working Days :" + totalWorkingDays);
        System.out.println("Total Working Hours :" + totalWorkHrs);
        System.out.println("Total Employee Wage for company " + company + " is :" + empWage);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage calculation");
        EmployeeWage comp1 = new EmployeeWage("COMP1", 40, 22, 140);
        EmployeeWage comp2 = new EmployeeWage("COMP2", 90, 21, 222);
        EmployeeWage comp3 = new EmployeeWage("COMP3", 58, 22, 175);

        comp1.calculateEmpWage();
        System.out.println(comp1);
        System.out.println("------------------------------------------------------------------");
        comp2.calculateEmpWage();
        System.out.println(comp2);
        System.out.println("------------------------------------------------------------------");
        comp3.calculateEmpWage();
        System.out.println(comp3);
        System.out.println("------------------------------------------------------------------");
    }
}


