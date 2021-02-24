package generics;

public class KeyValuePair<K, V> {

	private K key;
	private V value;
	
	public KeyValuePair(K key, V value){
		this.key = key;
		this.value = value;
	}
	
	public String toString(){
		return "keyvalue=" + key + value;
	}
}
