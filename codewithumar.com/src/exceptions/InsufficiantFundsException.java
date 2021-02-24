package exceptions;

@SuppressWarnings("serial")
public class InsufficiantFundsException extends Exception{
	
	public InsufficiantFundsException(){
		super("Insufficiant funds in your account");
	}
	
	public InsufficiantFundsException(String message){
		super(message);
	}

}
