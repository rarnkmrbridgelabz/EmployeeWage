package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {
        static final int WAGE_PER_HOUR =20;
        static final int FULL_TIME_HOUR=0;
        public static void main(String[] args) {
            Random random = new Random();
            int empPresent= random.nextInt(2);
            int empWage=0;
            if(empPresent==0){
                System.out.println("Employee is absent");
            }
            else{
                empWage=WAGE_PER_HOUR*FULL_TIME_HOUR;
                System.out.println("Employee is Present");
            }
            System.out.println("Employee Wage:"+empWage);
        }
    }

