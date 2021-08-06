package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayRollService {
    private List<EmployeeData> employeePayrollList = new ArrayList<EmployeeData>();
    Scanner scanner = new Scanner(System.in);
   //Creating readEmployeeDataFromConsole method
    public void readEmployeeDataFromConsole()
    {
        System.out.println("Enter Employee Id");
        int id = scanner.nextInt();
        System.out.println("Enter Employee Name");
        String Name = scanner.next();
        System.out.println("Enter the salary");
        int salary = scanner.nextInt();
        employeePayrollList.add(new EmployeeData(id, Name, salary));
    }
    //Creating writeEmployeeDataInConsole method
    public void writeEmployeeDataInConsole()
    {
        System.out.println("Displaying Employee Pay Roll Data \n"+employeePayrollList);
    }
}
