package com.bridgelabz;

public interface InterfaceEmployeeWage {
    public void addCompanyEmpWage(String company, int wagePerHour, int workingDay, int totalWorkHrs);
    public void calculateEmpWage();public int getTotalWage(String company);
}
