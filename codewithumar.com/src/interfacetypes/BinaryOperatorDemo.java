package interfacetypes;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorDemo {
	public static void show() {
		BinaryOperator<Integer> add = (a, b) -> a + b;
		Function<Integer, Integer> squere = a -> a * a;
		
		int res1 = add.apply(1, 2);
		int res2 = add.andThen(squere).apply(1, 2);
		System.out.println(res1);
		System.out.println(res2);
	}

}
