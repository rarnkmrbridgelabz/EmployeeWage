package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {
    static final int WAGE_PER_HOUR =20;
    static final int FULL_TIME_HOUR=8;
    static final int PART_TIME_HOUR=4;
    static final int IS_PART_TIME=1;
    static final int IS_FULL_TIME=2;
    static final int WORKING_DAYS_PER_MONTH=20;
    public static void main(String[] args) {
        int workingDays=1;
        int totalWage=0;
        while(workingDays<WORKING_DAYS_PER_MONTH) {
            Random random = new Random();
            int empPresent = random.nextInt(3);
            int empWage = 0;
            switch (empPresent) {
                case IS_PART_TIME:
                    empWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    break;
                case IS_FULL_TIME:
                    empWage = WAGE_PER_HOUR * FULL_TIME_HOUR;
                    break;
                default:
                    empWage = 0;
            }
            totalWage = totalWage + empWage;
            workingDays++;
        }
        System.out.println("Employee Wage:"+totalWage);
    }

    }


