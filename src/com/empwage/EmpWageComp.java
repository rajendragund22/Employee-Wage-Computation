package com.empwage;

public class EmpWageComp {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		int WAGE_PER_HR = 20;
		int DAY_PER_MONTH = 20;
		int hrOfDay;
		int totalWage = 0;
		for (int i = 1; i < DAY_PER_MONTH + 1; i++) {
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
			int empWage = WAGE_PER_HR * hrOfDay;
			System.out.println("Day " + i + " Employee wage is : " + empWage);
			totalWage = totalWage + empWage;
		}
		System.out.println("Total Emp wage for 20 days = " +totalWage);
	}
}
