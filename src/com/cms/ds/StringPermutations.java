package com.cms.ds;

public class StringPermutations {

	public static void main(String[] args) {
		String str = "abc";
		permutation(str);
	}

	public static void permutation(String str) {
		permutation("", str);
	}

	private static void permutation(String prefix, String str) {
		//System.out.println("prefix:" + prefix);
		//System.out.println("str:" + str);
		int n = str.length();
		if (n == 0) {
			System.out.println("realprint:" + prefix);
			//System.out.println();
			//System.out.println();
		} else {
			for (int i = 0; i < n; i++) {
				//System.out.println(prefix + str.charAt(i) + "," + str.substring(0, i) + str.substring(i + 1, n));
				//System.out.println();
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
			}
		}
	}
}
