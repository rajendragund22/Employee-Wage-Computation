package com.empwage;

public class EmpWageComp {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		int IS_PRESENT = 1;
		int IS_PART_TIME = 2;
		int WAGE_PER_HR = 20;
		int hrOfDay;
		int empCheck = (int) Math.floor(Math.random() * 3);
		if (empCheck == IS_PRESENT) {
			System.out.println("Employee is Present");
			hrOfDay = 8;

		} else if (empCheck == IS_PART_TIME) {
			System.out.println("Employee is Part time");
			hrOfDay = 4;

		} else {
			System.out.println("Employee is Absent");
			hrOfDay = 0;
		}
		int empWage = WAGE_PER_HR * hrOfDay;
		System.out.println("Daily Employee wage is : " + empWage);
	}
}
