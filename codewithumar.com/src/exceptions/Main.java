package exceptions;


public class Main {

	public static void main(String[] args) {
		try {
			Exceptions.show();
		} catch (Throwable e) {
			System.out.println("Unexpected error occured.");
		}
	}

}
