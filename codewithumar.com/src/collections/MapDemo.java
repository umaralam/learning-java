package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void show(){
		Customers c1 = new Customers("a", "e1");
		Customers c2 = new Customers("b", "e2");
//		Customers unknown = new Customers("unknown", "");
		Map<String, Customers> map = new HashMap<String, Customers>();
		map.put(c1.getEmail(), c1);
		map.put(c2.getEmail(), c2);
		
//		Customers unknown = new Customers("unknown", "");
//		Customers customer = map.getOrDefault("e10", unknown);
//		Customers customer = map.get("e1");
		map.replace("e1", new Customers("a++", "e1"));
//		boolean exists = map.containsKey("e10");
//		map.remove("e1");
//		for(String key : map.keySet())
//		for ( Entry<String, Customers> entry  : map.entrySet())
//		for (Customers customer : map.values())
//		System.out.println(customer);
//		System.out.println(exists);
//		System.out.println(entry);
		System.out.println(map);
//		System.out.println(key);
	}

}
