package interfacetypes;

import java.util.function.Function;

public class FunctionDemos {
	
	public static void show() {
		Function<String, Integer> strLength;
				strLength = str -> str.length();
		int length = strLength.apply("sky");
		System.out.println(length);
		
//		Function<String, String> replaceColon = str -> str.replace(":", "=");
//		Function<String, String> addBraces = str -> "{" + str + "}";
//	//composing functions
//		String result1 = replaceColon.andThen(addBraces).apply("key:value");
//		String result2 = addBraces.compose(replaceColon).apply("key:value");//reverse order
//		System.out.println(result1 + "-" + result2);
	}

}
