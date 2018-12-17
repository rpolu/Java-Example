package com.ram.ds;

public class FibonicSeriesInjava {
	public static void main(String[] args) {
		/*int first = 0;
		int second = 1;
		while (first < 100) {
			System.out.print(first + " ");
			int sum = first + second;
			first = second;
			second = sum;
		}*/
		int n = 153;
        int temp=n;
		int newNumber = 0;
		while (n > 0) {
			int reminder = n % 10;
			n = n / 10;
			newNumber = newNumber + (reminder * reminder * reminder);
		}
		if (temp == newNumber) {
			System.out.println(temp + " is armstrong");
		}
	}

}
