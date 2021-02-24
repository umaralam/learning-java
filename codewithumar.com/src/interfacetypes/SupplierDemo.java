package interfacetypes;

import java.util.function.Supplier;

public class SupplierDemo {
	public static void show() {
		Supplier<Double> getRandom = () -> Math.random();
		double random = getRandom.get();
		System.out.println(random);
	}

}
