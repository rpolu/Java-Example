package com.ram;

class StringUnique {
	public static boolean uniqueChars(String str) {
		if (str == null) {
			// throw exception.
			return true;
		}
		if (str.length() > 128) {
			return false;
		}
		boolean[] arr = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int charInt = (int) str.charAt(i);
			if (arr[charInt]) {
				return false;
			}
			arr[charInt] = true;
		}
		return true;
	}
}

public class AllUniqueCharExample {
	public static void main(String[] args) {
		String x = "mkjhgfer";
		System.out.println(StringUnique.uniqueChars(x));

	}

}
