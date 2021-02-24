package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamDemos {
	public static void show() {
		List<Movie> movies = new ArrayList<Movie>();
		movies.add(new Movie("a", 10, Genre.THRILLER));
		movies.add(new Movie("b", 15, Genre.ACTION));
		movies.add(new Movie("c", 20, Genre.ACTION));
		
		Map<Genre, Long> result = movies.stream()
			.collect(Collectors.groupingBy(Movie::getGenre, Collectors.counting()));
		System.out.println(result);
//		Movie any = movies.stream()
//			.findAny()
//			.get();
//		System.out.println(any.getLikes());
//			.filter(m -> m.getLikes() > 10)
//			.map(m -> m.getTitle())
//			.forEach(t -> System.out.println(t));
//		int[] numbers = { 1, 2, 3 };
//		Arrays.stream(numbers).forEach(n -> System.out.println(n));
//		Stream<Double> numbers = Stream.generate(() -> Math.random());
//			numbers
//			.limit(3)
//			.forEach(n -> System.out.println(n));
//		Stream.iterate(101, n -> n + 1)
//		.limit(10)
//		.forEach(n -> System.out.println(n));
		//imperative programming
//		int count = 0;
//		for (Movie movie : movies) {
//			if(movie.getLikes() > 10)
//			count++;
//		}
//		System.out.println(count);
//		
		//Declarative programming
//		long result = movies.stream().
//				filter(movie -> movie.getLikes() > 10)
//				.count();
//		System.out.println(result);
//		movies.stream()
//		.map(movie -> movie.getTitle())
//		.forEach(name -> System.out.println(name));
//		
//		movies.stream()
//		.mapToInt(movie -> movie.getLikes())
//		.forEach(n -> System.out.println(n));
//		List<Integer> list1 = new ArrayList<Integer>();
//		Collections.addAll(list1, 1, 2, 3 );
//		List<Integer> list2 = new ArrayList<Integer>();
//		Collections.addAll(list2, 4, 5, 6 );
		
		
//		Stream<List<Integer>> stream = Stream.of(list1, list2);
//		stream.forEach(list -> System.out.println(list));
		
//		stream.flatMap(list -> list.stream())
//		.forEach(n -> System.out.println(n));
		
		
	}

}
