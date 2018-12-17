package com.ram.ds;

public class TestReverseNumber {
	public static void main(String[] args) {
		int num = 456;
		int reverseNum = 0;
		while (num != 0) {
			int remainder = num % 10;
			reverseNum = reverseNum * 10 + remainder;
			num = num / 10;
		}
		System.out.println(reverseNum);

		boolean isPrime = true;

		int x = 13;
		for (int i = 2; i < x / 2; i++) {
			if (x % i == 0) {
				isPrime = false;
			}
		}

		if (isPrime)
			System.out.println(x + " : is prime  number");
		else
			System.out.println(x + " : is not prime");

		int a = 12;
		int b = 10;
		a = a + b;// 22
		b = a - b;// 12
		a = a - b;// 10
		System.out.println("A :" + a);
		System.out.println("B :" + b);

		System.out.println();

	}

}
