package encapsulation;

import java.text.NumberFormat;

public class MortgageReport {
	final static byte MONTH_IN_YEARS = 12;
	private MortgageCalculator calculator;
	private final NumberFormat currency;
	
	
public MortgageReport(MortgageCalculator calculator) {
		this.calculator = calculator;
		currency = NumberFormat.getCurrencyInstance();
	}

public void printMortgage(){
	
		double mortgage = calculator.calculateMortgage();
		String mortgageFormatted = currency.format(mortgage);
		System.out.println();
		System.out.println("MORTGAGE");
		System.out.println("---------");
		System.out.println("Monthly Payments: " + mortgageFormatted);
		
		System.out.println();
	}

public void printPaymentSchedule(){
	
	System.out.println("Payments Scheduled");
	System.out.println("-------------------");
	
	for (double balance : calculator.getRemainingBalances())
	System.out.println(currency.format(balance));
}
}
