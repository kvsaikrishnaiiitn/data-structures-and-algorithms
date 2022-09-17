package com.cms.ds;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PermutationsOfString {

	public static void main(String[] args) {

		Set<String> set = permutationOfString("ABC");
		System.out.println("Permutations of String ABC are:");
		for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
			String string = iterator.next();
			System.out.println(string);
		}
	}

	public static Set<String> permutationOfString(String str) {
		Set<String> permutationSet = new HashSet();

		if (str.length() == 0) {
			permutationSet.add("");
			return permutationSet;
		}

		// take out first character of String
		char firstCharacter = str.charAt(0);
		// Remaining String
		String remainingString = str.substring(1);

		Set<String> permutatedSetForRemainingString = permutationOfString(remainingString);
		System.out.println("permutatedSetForRemainingString:" + permutatedSetForRemainingString);

		for (String permutedString : permutatedSetForRemainingString) {
			for (int index = 0; index <= permutedString.length(); index++) {
				String permutation = insertFirstCharAtDiffPlaces(permutedString, firstCharacter, index);
				permutationSet.add(permutation);
			}

		}
		return permutationSet;

	}

	public static String insertFirstCharAtDiffPlaces(String permutedString, char firstCharacter, int index) {
		/*
		 * System.out.println(
		 * "PermutationsOfString.insertFirstCharAtDiffPlaces()...permutedString:" +
		 * permutedString); System.out.println(
		 * "PermutationsOfString.insertFirstCharAtDiffPlaces()...firstCharacter:" +
		 * firstCharacter); System.out.println(
		 * "PermutationsOfString.insertFirstCharAtDiffPlaces()...index:" + index);
		 */
		// Inserting firstCharacter of original String at difference places based on index
		return permutedString.substring(0, index) + firstCharacter + permutedString.substring(index);
	}

}
