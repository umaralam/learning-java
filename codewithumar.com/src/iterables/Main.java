package iterables;

public class Main {

	public static void main(String[] args) {
		GenericList<String> list = new GenericList<String>();
		list.add("a");
		list.add("b");
		for(String item : list)
			System.out.println(item);

	}

}
