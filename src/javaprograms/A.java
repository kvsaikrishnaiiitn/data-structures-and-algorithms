package javaprograms;

import java.util.stream.Stream;

public class A {
	public static void main(String[] args) {
		Stream<Integer> nums = Stream.iterate(0, i -> i + 1);
		//nums.forEach(System.out::println);
		int sum = nums.filter(i -> i % 2 == 0).limit(5).reduce(0, Integer::sum);
		System.out.println(sum);
	}
}
