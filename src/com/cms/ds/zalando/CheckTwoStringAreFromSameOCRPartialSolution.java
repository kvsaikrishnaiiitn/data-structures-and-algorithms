package com.cms.ds.zalando;
public class CheckTwoStringAreFromSameOCRPartialSolution {

	public static void main(String[] args) {
		String S = "a10";
		String T = "10a";

		CheckTwoStringAreFromSameOCRPartialSolution thisClassObject = new CheckTwoStringAreFromSameOCRPartialSolution();
		System.out.println(thisClassObject.solution(S, T));

	}

	public boolean solution(String S, String T) {
		boolean areSameStrings = true;

		StringBuilder firstString = prepareFullString(S);
		StringBuilder secondString = prepareFullString(T);
		System.out.println("CheckTwoStringAreFromSameOCRPartialSolution.solution()...firstString:" + firstString);
		System.out.println("CheckTwoStringAreFromSameOCRPartialSolution.solution()...secondString:" + secondString);

		if (firstString.length() != secondString.length()) {
			// System.out.println("Not equal length");
			areSameStrings = false;
			return areSameStrings;
		}

		int realStringLength = firstString.length();

		for (int index = 0; index < realStringLength; index++) {
			char firstStringChar = firstString.charAt(index);
			char secondtStringChar = secondString.charAt(index);

			// System.out.println("CheckTwoStringAreFromSameOCRPartialSolution.solution()...firstStringChar:" +
			// firstStringChar);
			// System.out.println("CheckTwoStringAreFromSameOCRPartialSolution.solution()...secondtStringChar:" +
			// secondtStringChar);
			if (firstStringChar != '?' && secondtStringChar != '?') {
				// System.out.println("Outer if");
				if (firstStringChar != secondtStringChar) {
					// System.out.println("Inner if");
					areSameStrings = false;
					break;
				}
			} else {
				// System.out.println("Outer else");
				continue;
			}
		}

		return areSameStrings;

	}

	private StringBuilder prepareFullString(String S) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int index = 0; index < S.length(); index++) {
			char eachChar = S.charAt(index);
			int intValueOfChar = ((int) eachChar);

			if (intValueOfChar > 48 && intValueOfChar <= 57) {
				checkAndAddQuestionMarks(eachChar, stringBuilder);
			} else {
				stringBuilder.append(eachChar);
			}
		}
		return stringBuilder;
	}

	private void checkAndAddQuestionMarks(int intValueOfChar, StringBuilder stringBuilder) {
		while (intValueOfChar > 48) {
			stringBuilder.append('?');
			intValueOfChar--;
		}
	}

}
