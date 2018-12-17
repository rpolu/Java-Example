package com.ram;

public class CharOccurences2 {
	public static void main(String[] args) {
		int i;
		String str = "ramamohan";
		int counter[] = new int[128];
		for (i = 0; i < str.length(); i++) {
			int ascii = str.charAt(i);
			counter[ascii] = counter[ascii] + 1;
		}
		// Print Frequency of characters
		for (i = 0; i < 128; i++) {
			if (counter[i] != 0) {
				System.out.println("The character " + (char) i + " has occurred for " + counter[i] + " times");
			}
		}
	}

}
