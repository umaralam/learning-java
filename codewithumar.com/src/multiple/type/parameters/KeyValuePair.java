package multiple.type.parameters;

public class KeyValuePair<K, V> {
	@SuppressWarnings("unused")
	private K key;
	@SuppressWarnings("unused")
	private V value;
	
	public KeyValuePair(K key, V value){
		this.key = key;
		this.value = value;
	}

}
