package com.bridgelabz;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.bridgelabz.EmployeePayrollFileIOService.PAYROLL_FILE_NAME;

public class EmployeePayRollService {
    Scanner scanner = new Scanner(System.in);
    public enum IOService {
        CONSOLE_IO, FILE_IO, REST_IO };
    private List<EmployeeData> employeePayrollDataList;

    public EmployeePayRollService(List<EmployeeData> employeePayrollList) {
        this.employeePayrollDataList = employeePayrollList;
    }
    public EmployeePayRollService() {
        this.employeePayrollDataList = new ArrayList<>();
    }
    //Creating readEmployeeDataFromConsole method
    public void readEmployeeDataFromConsole() {
        System.out.println("Enter Employee Id");
        int id = scanner.nextInt();
        System.out.println("Enter Employee Name");
        String Name = scanner.next();
        System.out.println("Enter the salary");
        int salary = scanner.nextInt();
        employeePayrollDataList.add(new EmployeeData(id, Name, salary));
    }

    //Creating writeEmployeeDataInConsole method
    public void writeEmployeeData(IOService fileIO) {
        if (fileIO.equals(IOService.CONSOLE_IO)) {
            System.out.println(employeePayrollDataList);
        } else if (fileIO.equals(IOService.FILE_IO)) {
            new EmployeePayrollFileIOService().writeDataToFile(employeePayrollDataList);
        }
    }
    // This method is used to count the entries to ensure the operation worked
    public static long countEntries() {
        long entries = 0;
        try {
            entries = Files.lines(new File(PAYROLL_FILE_NAME).toPath()).count();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return entries;
    }
}
