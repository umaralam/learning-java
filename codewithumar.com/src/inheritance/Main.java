package inheritance;

public class Main {

	public static void main(String[] args) {
//		UIControl control = new UIControl();
//		control.disable();
//		System.out.println(control.getIsEnable());
		
//		TextBox textbox = new TextBox();
//		textbox.setTextBox("Hello World!");
//		System.out.println(textbox.getTextBox());
//		
//		UIControl control = new TextBox();
//		control.disable();
//		System.out.println(control.getIsEnable());
		
		UIControl[] controls =  {new TextBox(),new CheckBox()};
		for(UIControl control: controls){
			control.render();
		}

	}

}
