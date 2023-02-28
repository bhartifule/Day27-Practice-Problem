package com.bridgelabz.sql.Day27_Practice_Problem;

public class EmployeePayRollMain {
	public static void main(String[] args) {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        System.out.println("Welcome to the Employee_Payroll_Services");
        employeePayrollService.readEmployeeDataFromConsole();
        employeePayrollService.writeEmployeeDataInConsole();
    }
}
