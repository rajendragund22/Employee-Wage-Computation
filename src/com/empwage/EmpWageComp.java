package com.empwage;

public class EmpWageComp {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		int IS_PRESENT = 1;
		int empCheck = (int) Math.floor(Math.random() * 2);
		if (empCheck == IS_PRESENT) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}
	}
}
