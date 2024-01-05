package com.empwage;

public class EmpWageComp {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		int IS_PRESENT = 1;
		int WAGE_PER_HR = 20;
		int hrOfDay;
		int empCheck = (int) Math.floor(Math.random() * 2);
		if (empCheck == IS_PRESENT) {
			System.out.println("Employee is Present");
			hrOfDay=8;
			
		} else {
			System.out.println("Employee is Absent");
			hrOfDay=0;
		}
		int empWage=WAGE_PER_HR*hrOfDay ;
		System.out.println("Daily Employee wage is : "+ empWage);
	}
}
