package com.bridgelabz;

import java.util.ArrayList;

public class EmployeePayRollMain {
    //Main method
    public static void main(String[] args)
    {
        ArrayList<EmployeeData> employeePayrollList = new ArrayList<>();
       //Creating obj for EmployeePayRollService class
       EmployeePayRollService employeePayrollService = new EmployeePayRollService();
       System.out.println("Welcome to Employee Pay Roll");
       //calling readEmployeeDataFromConsole method
       employeePayrollService.readEmployeeDataFromConsole();
       //Calling writeEmployeeDataInConsole method
       employeePayrollService.writeEmployeeData(EmployeePayRollService.IOService.CONSOLE_IO);
    }
}
