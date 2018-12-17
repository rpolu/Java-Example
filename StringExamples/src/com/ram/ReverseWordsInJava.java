package com.ram;

import java.util.regex.Pattern;

public class ReverseWordsInJava {
	public static void main(String[] args) {

		String str = "hi how are you";
		Pattern ptr = Pattern.compile("\\s");
		String[] k = ptr.split(str);
		for (int i = k.length - 1; i>= 0; i--) {
			System.out.println(k[i]);
		}
	}
}
