package generics;

public class Main {

	public static void main(String[] args) {

//		User user1 = new User(20);
//		User user2 = new User(20);
//		
//		if(user1.compareTo(user2) < 0)
//			System.out.println("user1 is less than user2");
//		else if (user1.compareTo(user2) == 0)
//			System.out.println("user1 is equal to user2");
//		else
//			System.out.println("user1 is greater than user2");
		
//		int max = Utils.max(10, 20);
//		System.out.println(max);
//		User user = Utils.max(new User(10), new User(5));
//		System.out.println(user);
//		
//		Utils.print(1, "Umar");
//		KeyValuePair<Integer, String> keyvalue = new KeyValuePair<Integer, String>(10, "Alam");
//		System.out.println(keyvalue);
		
		GenericList<Instructors> instructors = new GenericList<Instructors>();
		GenericList<User> users = new GenericList<User>();
		Utils.printUsers(users,instructors);
		User user1 = users.get(0);
		System.out.println(user1);
		
	}

}
