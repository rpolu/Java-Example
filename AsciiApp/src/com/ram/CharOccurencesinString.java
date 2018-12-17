package com.ram;
public class CharOccurencesinString {
	public static void main(String[] args) {
		String x = "99ramamohanramA";
		for (char ch : x.toCharArray()) {
			int ascii = ch;
			if (ascii >= 48 && ascii <= 57) {
				System.out.println(ch + " : is numeric");
			} else if (ascii >= 65 && ascii <= 90) {
				System.out.println(ch + " : is alphabet . Upper case.");
			} else if (ascii >= 97 && ascii <= 122) {
				System.out.println(ch + " : is alphabet . Lower case.");
			}
		}
	}
}
