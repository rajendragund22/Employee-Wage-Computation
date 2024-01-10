package com.empwage;

public class EmpWageComp {
	final static int WAGE_PER_HR = 20;
	final static int DAY_PER_MONTH = 20;
	final static int MAX_WORKING_DAYS = 20;
	final static int MAX_WORKING_HRS = 100;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		EmployeeWageComp();
	}

	public static void EmployeeWageComp() {
		int hrOfDay;
		int totalWage = 0;
		int totalWorkingHrs = 0;
		int totalWorkingDays = 0;
		while (totalWorkingHrs <= MAX_WORKING_HRS && totalWorkingDays < MAX_WORKING_DAYS) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 3);
			switch (empCheck) {
			case 1:
				System.out.println("Employee is Present");
				hrOfDay = 8;
				break;

			case 2:
				System.out.println("Employee is Part time");
				hrOfDay = 4;
				break;

			default:
				System.out.println("Employee is Absent");
				hrOfDay = 0;
			}
			totalWorkingHrs += hrOfDay;
			int empWage = WAGE_PER_HR * hrOfDay;
			System.out.println("Day  Employee wage is : " + empWage);
			totalWage = totalWage + empWage;
		}
		System.out.println("Total working hrs = " + totalWorkingHrs);
		System.out.println("Total Emp wage for 20 days = " + totalWage);
	}

}
