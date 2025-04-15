package javaprograms;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseOfEachWordInSentence {

	public static void main(String[] args) {

		String sentence = "Java is good programming langauges";
		String reversedSentence = reverseUsingInBuiltMethod(sentence);
		System.out.println("reversedSentence:" + reversedSentence);

		String reversedSentenceUsingStream = reverseUsingStream(sentence);
		System.out.println("reversedSentenceUsingStream:" + reversedSentenceUsingStream);

		System.out.println(reversedSentence.equals(reversedSentenceUsingStream));
	}

	private static String reverseUsingStream(String sentence) {
		String reversedSentence = Arrays.stream(sentence.split(" ")).map(s -> new StringBuilder(s).reverse())
				.collect(Collectors.joining(" "));
		return reversedSentence;
	}

	private static String reverseUsingInBuiltMethod(String sentence) {
		String[] allWords = sentence.split(" ");
		StringBuilder reversedSentence = new StringBuilder();
		for (int index = 0; index < allWords.length; index++) {
			reversedSentence.append(reverseString(allWords[index]));
			if (index < allWords.length - 1) {
				reversedSentence.append(" ");
			}
		}
		return reversedSentence.toString();
	}

	private static Object reverseString(String string) {
		StringBuilder builder = new StringBuilder(string);
		return builder.reverse();
	}

}
