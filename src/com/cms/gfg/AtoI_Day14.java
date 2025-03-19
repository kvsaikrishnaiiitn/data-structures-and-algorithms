package com.cms.gfg;

public class AtoI_Day14 {

	public static void main(String[] args) {

		String nubmerString = "  -123gfg";
		int result = convertToNumber(nubmerString);
		System.out.println("AtoI_Day14.main()...result:" + result);
	}

	private static int convertToNumber(String nubmerString) {
		int sign = 1;
		int result = 0;
		int index = 0;
		char[] allNumberChars = nubmerString.toCharArray();

		while (allNumberChars[index] == ' ') {
			index++;
		}

		if (allNumberChars[index] == '-') {
			sign = -1;
			index++;
		}

		while (index < nubmerString.length() && allNumberChars[index] - '0' >= 0 && allNumberChars[index] - '0' <= 9) {
			result = result * 10 + allNumberChars[index] - '0';
			index++;
		}

		if (result > Integer.MAX_VALUE / 10 || (result > Integer.MAX_VALUE / 10 && allNumberChars[index] - '0' > 7)) {
			return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
		}

		result = sign * result;
		return result;
	}
}
