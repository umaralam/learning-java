package encapsulation;

public class MortgageCalculator {

	private static byte MONTH_IN_YEARS = 12;
	private static byte Percentage = 100;
	
	private int principal;
	private float annualInterestRate;
	private short years;
	
	public MortgageCalculator(int principal, float annualInterestRate, short years){
		
		this.principal = principal;
		this.annualInterestRate = annualInterestRate;
		this.years = years;
	}
	
	public double calculateMortgage(){
		
		float numberOfPayments = getNumberOfPayments();
		float monthlyInterestRate = getMonthlyInterestRate();
		double mortagage = principal * monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, numberOfPayments) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1));
		return mortagage;
		
	}

	
	public double calculateBalance(short numberOfPaymentsMade){
		
		int numberOfPayments = getNumberOfPayments();
		float monthlyInterestRate = getMonthlyInterestRate();
		
			double balance = principal * (Math.pow(1 + monthlyInterestRate, numberOfPayments) - Math.pow(1 + monthlyInterestRate, numberOfPaymentsMade)) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
		return balance;
	}
	
	public double[] getRemainingBalances(){
	
		double[] balances = new double[getNumberOfPayments()];
		
		for(short month = 1; month <= balances.length; month++)
			balances[month - 1] = calculateBalance(month);
			
		return balances;
			
	}
	
	private float getMonthlyInterestRate() {
		return annualInterestRate / Percentage / MONTH_IN_YEARS;
	}

	private int getNumberOfPayments() {
		return years * MONTH_IN_YEARS;
	}
}
