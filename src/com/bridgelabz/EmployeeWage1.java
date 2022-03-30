package com.bridgelabz;

import java.util.ArrayList;

public class EmployeeWage1 {
    public String company;
    public int wagePerHour;
    public int workingDay;
    public int totalWorkHrs;
    public int totalWage;

    public ArrayList<Integer> empDailyWage = new ArrayList<Integer>();

    public EmployeeWage1(String company, int wagePerHour, int workingDay, int totalWorkHrs) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.workingDay = workingDay;
        this.totalWorkHrs = totalWorkHrs;
    }

    public void setTotalEmpWage(int totalWage) {
        this.totalWage = totalWage;
    }
}
