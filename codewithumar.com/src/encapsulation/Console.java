package encapsulation;

import java.util.Scanner;

	public class Console {
		
		public static double readNumber(String prompt,double min,double max){
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		double value;
		
		while(true){
			System.out.print(prompt);
			value = scanner.nextFloat();
			if( value >= min && value <= max )
				break;
				System.out.println("Enter value between " + min + " and " + max);
		}	
		return value;
	}
}
