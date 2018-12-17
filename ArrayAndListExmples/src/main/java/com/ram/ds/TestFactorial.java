package com.ram.ds;

class Factorial {
	public int fact(int n) {
		if (n <= 1) {
			return 1;
		}
		return n * fact(n - 1);
	}
}

public class TestFactorial {
	public static void main(String[] args) {
		int n = 4;
		int fact = 1;
		for (int i = 2; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);

		Factorial f = new Factorial();
		int fz = f.fact(4);
		System.out.println(fz);

	}
}
