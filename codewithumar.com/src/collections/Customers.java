package collections;

public class Customers implements Comparable<Customers>{
	private String name;
	private String email;
	
	public Customers(String name, String email){
		this.name = name;
		this.email = email;
	}
	@Override
	public String toString(){
		return name;
	}
	@Override
	public int compareTo(Customers other) {
		return (name.compareTo(other.name));
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
