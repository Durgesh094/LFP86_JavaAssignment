package day3practiceproblem;

public class EmpWageBuilderUC3 {

	public static void main(String[] args) {
		int IS_PART_TIME = 1;
		int IS_FULL_TIME = 1;
		int EMPLOYEE_RATE_PER_HOUR = 20;
		int empHrs = 0;
		int empWage = 0;
		
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if ( empCheck == IS_FULL_TIME )
			empHrs = 8;
		else
			empHrs = 0;
		
		empWage = empHrs * EMPLOYEE_RATE_PER_HOUR;
		System.out.println("Employee FullTime Wage " + empWage );
		
		if( empCheck == IS_PART_TIME )
			empHrs = 8;
		else
			empHrs = 0;
		
		empWage = empHrs * EMPLOYEE_RATE_PER_HOUR;
		System.out.println("Employee PartTime Wage " + empWage );

	}

}