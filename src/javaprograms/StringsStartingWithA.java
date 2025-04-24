package javaprograms;

import java.util.List;
import java.util.stream.Collectors;

public class StringsStartingWithA {

	public static void main(String[] args) {

		List<String> strings = List.of("Apple", "Mango", "Banana");
		strings.stream().filter(s -> s.toLowerCase().startsWith("a")).collect(Collectors.toList())
				.forEach(System.out::println);
	}

}
