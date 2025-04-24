package javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindLongestNonRepeatingSubString {
	public static void main(String[] args) {
		findLongestNonRepeatingSubString("abcabcbb");
	}

	private static void findLongestNonRepeatingSubString(String input) {
		String longestSubstring = "";
		List<Character> chars = new ArrayList<>();
		for (int i = 0; i < input.length(); i++) {
			while (chars.contains(input.charAt(i))) {
				chars.remove(0);
			}
			chars.add(input.charAt(i));
			System.out.println("FindLongestNonRepeatingSubString.findLongestNonRepeatingSubString()...chars:" + chars);
			String currentSubstring = chars.stream().map(String::valueOf).collect(Collectors.joining(""));
			System.out.println("FindLongestNonRepeatingSubString.findLongestNonRepeatingSubString()...currentSubstring:"
					+ currentSubstring);
			if (currentSubstring.length() > longestSubstring.length()) {
				longestSubstring = currentSubstring;
			}
		}
		System.out.println(longestSubstring);
	}

}