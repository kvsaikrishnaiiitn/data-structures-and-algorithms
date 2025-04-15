package javaprograms;

public class ReveseAString {

	public static void main(String[] args) {

		String string = "abcde";
		String revesedString = reverseString(string);
		System.out.println(revesedString);

	}

	private static String reverseString(String string) {
		char[] allChars = string.toCharArray();
		int left = 0;
		int right = allChars.length - 1;
		while (left < right) {
			char temp = allChars[left];
			allChars[left] = allChars[right];
			allChars[right] = temp;
			left++;
			right--;
		}
		return new String(allChars);
	}

}
