package com.cms.ds.zalando;
public class CheckTwoStringAreFromSameOCRFullSolution {

	public static void main(String[] args) {

		/*
		 * String S = "a10bx3x"; String T = "10a";
		 */
		/*
		 * String S = "a10"; String T = "10a";
		 */

		/*
		 * String S = "a2Le"; String T = "3L1";
		 */

		String S = "3x2x";
		String T = "3x1ax";

		// prepareFullString(S)
		// prepareFullString(T)

		System.out.println(solution(S, T));

	}

	public static boolean solution(String S, String T) {
		boolean areSameStrings = true;

		StringBuilder firstString = prepareFullString(S);
		StringBuilder secondString = prepareFullString(T);
		// System.out.println("CheckTwoStringAreFromSameOCRFullSolution.solution()...firstString:"
		// + firstString);
		// System.out.println("CheckTwoStringAreFromSameOCRFullSolution.solution()...secondString:"
		// + secondString);

		if (firstString.length() != secondString.length()) {
			// System.out.println("Not equal length");
			areSameStrings = false;
			return areSameStrings;
		}

		int realStringLength = firstString.length();

		for (int index = 0; index < realStringLength; index++) {
			char firstStringChar = firstString.charAt(index);
			char secondtStringChar = secondString.charAt(index);

			// System.out.println("CheckTwoStringAreFromSameOCRFullSolution.solution()...firstStringChar:"
			// +
			// firstStringChar);
			// System.out.println("CheckTwoStringAreFromSameOCRFullSolution.solution()...secondtStringChar:"
			// +
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

	public static StringBuilder prepareFullString(String string) {
		int stringLength = string.length();

		StringBuilder fullStringBuilder = new StringBuilder();
		StringBuilder numberStringBuilder = new StringBuilder();

		int index = 0;
		while (index < stringLength) {
			Character eachCharacter = string.charAt(index);
			if (Character.isAlphabetic(eachCharacter)) {
				fullStringBuilder.append(eachCharacter);
				index++;
			} else if (Character.isDigit(eachCharacter)) {
				while (Character.isDigit(eachCharacter)) {
					numberStringBuilder.append(eachCharacter);
					if (index + 1 < stringLength) {
						if (Character.isDigit(string.charAt(index + 1))) {
							index++;
							eachCharacter = string.charAt(index);
						} else if (Character.isAlphabetic(string.charAt(index + 1))) {
							// System.out.println("Adding quetstion marks inside else if");
							fullStringBuilder
									.append(addQuestionMarks(Integer.parseInt(numberStringBuilder.toString())));
							numberStringBuilder = new StringBuilder();
							break;
						}
					} else {
						// System.out.println("Adding quetstion marks inside else");
						fullStringBuilder.append(addQuestionMarks(Integer.parseInt(numberStringBuilder.toString())));
						numberStringBuilder = new StringBuilder();
						break;
					}
				}
				if (index + 1 < stringLength) {
					index++;
				} else {
					break;
				}
			}
		} // while end
			// System.out.println("PrepareFullString.prepareFullString()...fullStringBuilder:"
			// + fullStringBuilder.toString());
		return fullStringBuilder;
	}

	public static StringBuilder addQuestionMarks(int numberOfQuestionMarks) {
		StringBuilder questionMarks = new StringBuilder();
		while (numberOfQuestionMarks > 0) {
			questionMarks.append('?');
			numberOfQuestionMarks--;
		}
		return questionMarks;
	}

}
