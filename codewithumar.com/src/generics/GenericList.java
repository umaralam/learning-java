package generics;

public class GenericList<T> {
	@SuppressWarnings("unchecked")
	private T[] users = (T[]) new Object[10];
	private int count;
	
	public void add(T user){
		users[count++] = user;
	}
	
	public T get(int index){
		return users[index];
	}

}
