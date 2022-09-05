package com.cms.ds.zalando;
import java.util.ArrayList;
import java.util.List;

public class ProperPrefixAndSuffix {

	public static void main(String[] args) {
		String inputString = "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbccccccccccccccccccccdddddddddddddddddddddeeeeeeeeeeeeeeeeeeeefffffffffffffffffggggggggggggggggggghhhhhhhhhhhhhhhhhiiiiiiiiiiiiiiiigggggggggggggggggggiiiiiiiiiiiiiiii";
		ProperPrefixAndSuffix properPrefixAndSuffix = new ProperPrefixAndSuffix();
		System.out.println(properPrefixAndSuffix.solution(inputString));
	}

	public int solution(String S) {
		int stringLength = S.length();
		String longestProperPrefixAndSuffix = "";

		List<String> prefixStrings = new ArrayList<>();
		List<String> suffixStrings = new ArrayList<>();

		for (int index = 0; index < stringLength; index++) {
			String eachPrefix = S.substring(0, index);
			prefixStrings.add(eachPrefix);
		}

		for (int index = stringLength; index > 0; index--) {
			String eachSuffix = S.substring(index, stringLength);
			suffixStrings.add(eachSuffix);
		}

		for (String eachPrefix : prefixStrings) {
			if (suffixStrings.contains(eachPrefix)) {
				if (eachPrefix.length() > longestProperPrefixAndSuffix.length()) {
					longestProperPrefixAndSuffix = eachPrefix;
				}
			}
		}

		return longestProperPrefixAndSuffix.length();
	}
}
