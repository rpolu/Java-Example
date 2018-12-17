package com.ram;

public class CherOccurences1 {
	public static void main(String[] args) {
		String x = "ramamohan";
		int i = 0;
		int j = 0;
		int size = x.length();
		int count = 0;
		for (i = 0; i < size; i++) {
			count = 0;
			for (j = 0; j < size; j++) {
				if (x.charAt(i) == x.charAt(j)) {
					count++;
				}
			}
			System.out.println(x.charAt(i) + " : " + count);
		}
	}

}
