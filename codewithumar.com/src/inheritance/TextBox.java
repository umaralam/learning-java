package inheritance;

public class TextBox extends UIControl{

	private String text = "";
	
//	public TextBox(){
//		super(true);
//		System.out.println("TextBox");
//	}
	
	@Override
	public void render(){
		System.out.println("Text Box");
	}
	
	public void setTextBox(String text){
		this.text = text;
	}
	
	public void clear(){
		text = "";
	}
	
	public String getTextBox(){
		return text;
	}
}
