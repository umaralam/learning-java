package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
	public static void show(){
		Collection<String> collection = new ArrayList<String>();
		Collections.addAll(collection, "A", "B", "C");
		String[] strArray = collection.toArray(new String[0]);
		System.out.println(strArray[1]);
	}

}
