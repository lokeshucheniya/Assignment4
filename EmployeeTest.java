
public class EmployeeTest {
	private int id;
	private String name;
	private double monthlyBasic,PFRate;
	private double hra = monthlyBasic/2;
	static final double medicalAllowance = 1250;
	static final double conveyanceAllowance = 800;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPFRate() {
		return PFRate;
	}

	public void setpFRate(double PFRate) {
		this.PFRate = PFRate;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public static double getMedicalallowance() {
		return medicalAllowance;
	}

	public static double getConveyanceallowance() {
		return conveyanceAllowance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMonthlyBasic() {
		return monthlyBasic;
	}

	public void setMonthlyBasic(double monthlyBasic) {
		this.monthlyBasic = monthlyBasic;
	}
	
	public double getAnnualBasic(double monthlyBasic) {
		double AnnualBasic = monthlyBasic*12;
		return AnnualBasic;
		
	}
	
	public double getMonthlyGrossSalary() {
		double MonthlyGrossSalary = monthlyBasic + hra + medicalAllowance + conveyanceAllowance;
		return MonthlyGrossSalary;
	}
	
	public double getAnnualGrossSalary(double MonthlyGrossSalary) {
		double AnnualGrossSalary = MonthlyGrossSalary*12;
		return AnnualGrossSalary;
	}
	
	public double getMonthlyDeductions() {
		double PF;
		if((monthlyBasic/10)<6500) {
			PF=(monthlyBasic/10);
		}
		else
			PF=6500;
		
		double ESIC;
		
		if(monthlyBasic<=5000) {
			ESIC = (monthlyBasic*475)/10000;
		}
		else
			ESIC=0;
		
		double ProfTax;
		
		EmployeeTest employee = new EmployeeTest();
		double monthlyGrossSalary = employee.getMonthlyGrossSalary();
		
		if(monthlyGrossSalary<=10000) {
			ProfTax = 50;
		}
		else
			ProfTax = 100;
		
		double monthlyDeduction = PF + ESIC + ProfTax;
		
		return monthlyDeduction;
	}
	
	public double getMonthlyTakeHome(double monthlyGrossSalary, double monthlyDeduction) {
		double monthlyTakeHome = monthlyGrossSalary - monthlyDeduction;
		return monthlyTakeHome;
	}
	
	public double getAnnualTakeHome(double monthlyTakeHome) {
		double annualTakeHome = monthlyTakeHome*12;
		return annualTakeHome;
	}

}
