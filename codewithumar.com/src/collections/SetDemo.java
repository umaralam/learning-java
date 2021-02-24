package collections;

//import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collection;
//import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void show(){
		Set<String> set1 = new HashSet<String>(Arrays.asList("a", "b", "c"));
		Set<String> set2 = new HashSet<String>(Arrays.asList("b", "c", "d"));
		set1.retainAll(set2);
		System.out.println(set1);
	}

}
