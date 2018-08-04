import java.util.Scanner;

public class Employee {
	public static void main(String args[]) {
		Scanner src = new Scanner(System.in);
		
		//Entering details of Employee
		System.out.println("Enter Your Id");
		int id = src.nextInt();
		
		System.out.println("Enter Your Name");
		String name = src.next();
		
		System.out.println("Enter Your Monthly Basic");
		double monthlyBasic = src.nextInt();
		
		
		EmployeeTest employee = new EmployeeTest();			//Object of Class EmployeeTest
		
		double annualBasic  = employee.getAnnualBasic(monthlyBasic);
		System.out.println("Annual Basic is " +annualBasic);
		
		double hra = employee.getHra();
		double medicalAllowance = employee.getMedicalallowance();
		double conveyanceAllowance = employee.getConveyanceallowance();
		
		double monthlyGrossSalary = employee.getMonthlyGrossSalary();
		System.out.println("Monthly Gross Salary is " +monthlyGrossSalary);
		
		double annualGrossSalary = employee.getAnnualGrossSalary(monthlyGrossSalary);
		System.out.println("Annual Gross Salary is " +annualGrossSalary);
		
		double monthlyDeduction = employee.getMonthlyDeductions();
		System.out.println("Monthly Deduction is " +monthlyDeduction);
		
		double monthlyTakeHome = employee.getMonthlyTakeHome(monthlyGrossSalary, monthlyDeduction);
		System.out.println("Monthly Take Home Salary is " +monthlyTakeHome);
		
		
		src.close();
	}

	

	
}
