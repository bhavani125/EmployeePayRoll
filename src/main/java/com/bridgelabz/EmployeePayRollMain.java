package com.bridgelabz;

public class EmployeePayRollMain {
    //Main method
    public static void main(String[] args)
    {
       //Creating obj for EmployeePayRollService class
       EmployeePayRollService employeePayrollService = new EmployeePayRollService();
       System.out.println("Welcome to Employee Pay Roll");
       //calling readEmployeeDataFromConsole method
       employeePayrollService.readEmployeeDataFromConsole();
       //Calling writeEmployeeDataInConsole method
       employeePayrollService.writeEmployeeDataInConsole();
    }
}
