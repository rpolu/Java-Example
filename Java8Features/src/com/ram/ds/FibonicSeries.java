package com.ram.ds;

class Fseries {

	public int fib(int n) {
		if (n <= 1) {
			return n;
		}
		return fib(n - 1) + fib(n - 2);
	}

}
public class FibonicSeries {
	public static void fibonicSeries(int n) {
		int fitst = 0;
		int second = 1;
		for (int i = 0; i < 10; i++) {
			System.out.print(fitst + " ");
			int sum = fitst + second;
			fitst = second;
			second = sum;

		}
		System.out.println();
	}

	public static void main(String[] args) {
		fibonicSeries(9);
		Fseries f = new Fseries();
		for (int i = 0; i <= 9; i++) {
			System.out.print(f.fib(i)+" ");

		}

	}

}
