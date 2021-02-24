package encapsulation;

public class Main {

	public static void main(String[] args) {
		int principal = (int) Console.readNumber("Enter principal :", 1000, 1000000);
		float annualInterestRate = (float) Console.readNumber("Annual Interest Rate :", 1, 30);
		short years = (short) Console.readNumber("Period (Years) :", 1, 30);
		
		MortgageCalculator calculator = new MortgageCalculator(principal, annualInterestRate, years);
		MortgageReport report = new MortgageReport(calculator);
		report.printMortgage();		
		report.printPaymentSchedule();

	}

}
