package com.cms.ds;

import java.util.HashSet;
import java.util.Set;

public class PrintSmallestPositiveNumber {

	public static void main(String[] args) {
		int[] array = { -1, 0, 2 };
		System.out.println(solution(array));
	}

	public static int solution(int[] A) {
		// write your code in Java SE 8

		int N = A.length;
		Set<Integer> set = new HashSet<>();
		for (int a : A) {
			if (a > 0) {
				set.add(a);
			}
		}
		for (int i = 1; i <= N + 1; i++) {
			if (!set.contains(i)) {
				return i;
			}
		}
		return N;
	}
}
