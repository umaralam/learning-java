package basics;

public class Main {
	public static void main(String args[]) {
		//1234
		int number = 12321;
		int temp = number;
		int rev = 0;
		while(number > 0) {
			rev = rev * 10 + number % 10;
			number = number / 10;
		}
		System.out.println(rev);
		if (rev ==  temp) {
			System.out.println("number is palindrom");
		}
			else {
				System.out.println("number is not palindrome");
			}
	}

}
