package javaprograms;

import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		String string = "Learn Java Programming";
		HashMap<Character, Integer> frequencyMap = new HashMap<>();
		for (char eachChar : string.toCharArray()) {
			if (eachChar != ' ') {
				frequencyMap.put(eachChar, frequencyMap.getOrDefault(eachChar, 0) + 1);
			}
		}

		for (char eachCharInMap : frequencyMap.keySet()) {
			if (frequencyMap.get(eachCharInMap) > 1) {
				System.out.println(eachCharInMap + ":" + frequencyMap.get(eachCharInMap));
			}
		}
		
		string.chars().mapToObj(c -> (char) c).filter(c -> !c.equals(' '))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() > 1).forEach(System.out::println);

	}
}
