package generics;

public class Utils {

	public static <T extends Comparable<T>> T max(T first, T second){
		return (first.compareTo(second) < 0) ? second : first; 
	}
	
	public static <K, V> void print(K key, V value){
		System.out.println(key + "=" + value);
	}
	
	public static void printUsers(GenericList<? super User> user, GenericList<? super Instructors> instructors){
//		User x = user.get(0);
		user.add(new User(10));
	}
}
