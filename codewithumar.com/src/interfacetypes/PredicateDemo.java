package interfacetypes;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void show() {
//		Predicate<String> isLongerThan5 = str -> str.length() > 5;
//		boolean result = isLongerThan5.test("skiess");
//		System.out.println(result);
		
		//combining predicates
		Predicate<String> hasLeftBrace = str -> str.startsWith("{");
		Predicate<String> hasRightBrace = str -> str.endsWith("}");
		
		Predicate<String>  hasLeftAndRightBrace = hasLeftBrace.and(hasRightBrace);
		boolean result = hasLeftAndRightBrace.test("{key:value}");
		System.out.println(result);
		Predicate<String> negateBrace = hasLeftBrace.negate();
		boolean res = negateBrace.test("key:value}");
		System.out.println(res);
		
	}

}
