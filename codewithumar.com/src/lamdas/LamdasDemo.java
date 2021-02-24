package lamdas;

public class LamdasDemo {
	public String message;
	public LamdasDemo(String message) {
		System.out.println(message);
	}
//	public static void print(String message) {
//		System.out.println(message);
//	}
//	public void print(String message) {
//		System.out.println(message);
//	}
	public static void show() {
		
//		greet(message -> System.out.println(message));
//		greet(System.out::println);
//		greet(message -> print(message));
//		greet(LamdasDemo::print);
//		LamdasDemo demo = new LamdasDemo();
//		greet(message -> demo.print(message));
//		greet(demo::print);
		greet(message -> new LamdasDemo(message));
		greet(LamdasDemo::new);
		
//		greet(new Printer() {
//			
//			@Override
//			public void print(String message) {
//				System.out.println(message);
//				
//			}
//		});
	
//		greet(new ConsolePrinter());
	}
		
	public static void greet(Printer printer) {
		printer.print("Hello World!");
	}

}
