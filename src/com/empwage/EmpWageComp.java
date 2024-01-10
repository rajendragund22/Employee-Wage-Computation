package com.empwage;

public class EmpWageComp {
	int WAGE_PER_HR = 20;
	int DAY_PER_MONTH = 20;
	int MAX_WORKING_DAYS = 20;
	int MAX_WORKING_HRS = 100;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation\n");

		EmpWageComp emp1 = new EmpWageComp();
		emp1.EmployeeWageComp("Infosys", 5, 10, 50);

		EmpWageComp emp2 = new EmpWageComp();
		emp2.EmployeeWageComp("TCS", 10, 10, 100);
		
		EmpWageComp emp3 = new EmpWageComp();
		 emp3.EmployeeWageComp("Wipro", 15, 20, 200);
		
	}

	public void EmployeeWageComp(String cName, int cEmpWage, int cWorkDay, int cWorkHr) {
		int hrOfDay;
		int totalWage = 0;
		int totalWorkingHrs = 0;
		int totalWorkingDays = 0;
		WAGE_PER_HR = cEmpWage;
		MAX_WORKING_DAYS =cWorkDay;
		MAX_WORKING_HRS = cWorkHr;
		while (totalWorkingHrs <= MAX_WORKING_HRS && totalWorkingDays < MAX_WORKING_DAYS) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 3);
			switch (empCheck) {
			case 1:
				hrOfDay = 8;
				break;

			case 2:
				hrOfDay = 4;
				break;

			default:
				hrOfDay = 0;
			}
			totalWorkingHrs += hrOfDay;
			int empWage = WAGE_PER_HR * hrOfDay;
			totalWage = totalWage + empWage;
		}
		System.out.println("Company Name : "+cName+"\nEmployee Wage : "+cEmpWage+"\nWorking day per Month : "+cWorkDay+"\nWorking hour per Month : "+cWorkHr);
		System.out.println(cName + " company Total Daily Wage for days " + totalWorkingDays + " and hours "
				+ totalWorkingHrs + " is: " + totalWage+"\n");
	}

}
