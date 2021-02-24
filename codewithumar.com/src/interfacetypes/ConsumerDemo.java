package interfacetypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;


public class ConsumerDemo {
	public static void show() {
		//consumer interface example
//		List<Integer> list = new ArrayList<Integer>();
//		Collections.addAll(list, 1, 2, 3, 4);
		
//		for (Integer item : list)
//			System.out.println(item);
		
//		list.forEach(item -> System.out.println(item));
		
		//chaining consumer iterface example
		
		List<String> list = new ArrayList<String>();
		Collections.addAll(list, "a", "b", "c");
		
		Consumer<String> print = item -> System.out.println(item);
		Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());
		list.forEach(print.andThen(printUpperCase).andThen(print));
		
		
		
	}
	
	
}
