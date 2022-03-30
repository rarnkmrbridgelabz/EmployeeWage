package com.bridgelabz;

import java.util.ArrayList;
import java.util.Random;

public class EmployeeWage {
    static final int EMP_FULL_TIME = 1;
    static final int EMP_PART_TIME = 2;

    private ArrayList<EmployeeWage1> employeeWage1ArrayList;

    public EmployeeWage() {
        employeeWage1ArrayList = new ArrayList<EmployeeWage1>();
    }

    public void addCompanyEmpWage(String company, int wagePerHour, int workingDay, int totalWorkHrs) {

        EmployeeWage1 employeeWage1 = new EmployeeWage1 (company, wagePerHour, workingDay, totalWorkHrs);
        employeeWage1ArrayList.add(employeeWage1);
    }

    public void calculateEmpWage() {
        for(int i=0; i < employeeWage1ArrayList.size(); i++) {
            EmployeeWage1 employeeWage1 = employeeWage1ArrayList.get(i);
            employeeWage1.setTotalEmpWage(this.calculateEmpWage(employeeWage1));
            System.out.println("Company Name :" +employeeWage1.company);
            DisplayDailyWageforCompany(employeeWage1);
            System.out.println(employeeWage1.company + "Total Wage is " + employeeWage1.totalWage);
        }
    }
    public void DisplayDailyWageforCompany(EmployeeWage1 employeeWage1) {
        for (int i = 0; i < employeeWage1.empDailyWage.size(); i++) {
            int day = i + 1;
            System.out.println("Daily Wage For Day" + day + ":" + employeeWage1.empDailyWage.get(i));
        }
    }

    public int calculateEmpWage(EmployeeWage1 employeeWage1){

        int empWage = 0;
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;

        while (totalWorkingDays < employeeWage1.workingDay && totalWorkingHours < employeeWage1.totalWorkHrs) {

            Random random = new Random();
            int empPresent = random.nextInt(3);
            System.out.println("Random Value for Employee Attendance is :" + empPresent);

            int x;
            switch (empPresent) {

                case EMP_FULL_TIME:

                    x = employeeWage1.wagePerHour * 8;
                    empWage = empWage + x;
                    totalWorkingHours = totalWorkingHours + 8;
                    System.out.println("Employee is present and the wage is : " + empWage);
                    totalWorkingDays++;
                    break;

                case EMP_PART_TIME:
                    x = employeeWage1.wagePerHour * 4;
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
        System.out.println("Total Working Hours :" + employeeWage1.totalWorkHrs);
        System.out.println("Total Employee Wage for company " + employeeWage1.company + " is :" + empWage);

        return empWage;
    }


    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage calculation");
        EmployeeWage empWage = new EmployeeWage();
        empWage.addCompanyEmpWage("BIG BASKET", 40, 22, 140);
        empWage.addCompanyEmpWage("AMAZON", 90, 21,222);
        empWage.addCompanyEmpWage("TARGET", 58, 22, 175);
        empWage.calculateEmpWage();

    }

}


