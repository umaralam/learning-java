package exceptions;

//import java.io.FileReader;
//import java.io.IOException;


public class Exceptions {

//	static FileReader reader = null;


	public static void show(){
		Account account = new Account();
		try {
			account.withdraw(10);
		} catch (AccountException e) {
			Throwable cause = e.getCause();
			System.out.println(cause.getMessage());
		}
//		try {
//			account.deposit(-1);
//		} catch (IOException e) {
//			
//			System.out.println("Logging!!");
//			throw e;
//		}
//		try {
//			reader = new FileReader("file.txt");
//			System.out.println("File is open");
//			reader.read();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		finally{
//			try {
//				if(reader != null){
//					reader.close();
//				}
//				
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		
	}
	
	
}
