package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemos {
	public static void show(){
		List<String> list = new ArrayList<String>();
		Collections.addAll(list, "a", "b", "c");
		System.out.println(list.subList(0, 3));
	}

}
