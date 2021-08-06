package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class EmployeePayRollTest {
    @Test
    public void  givenThreeEmployeesWhenWrittenToFileShouldMatchEmployeeEntries() {
        EmployeeData[] arrayOfEmployees = {
                new EmployeeData(1, "Bhavani", 3000),
                new EmployeeData(2, "lakshmi", 5000),
                new EmployeeData(3, "Sandhya", 10000)
        };
        //Crating object for  EmployeePayRollService class
        EmployeePayRollService employeePayRollService = new EmployeePayRollService(Arrays.asList(arrayOfEmployees));
        employeePayRollService.writeEmployeeData(EmployeePayRollService.IOService.FILE_IO);

        long entries = EmployeePayRollService.countEntries();
        Assert.assertEquals(3, entries);
    }
}


