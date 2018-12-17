package com.ram.java7;

public class Before7Switch {

	public static void main(String[] args) {
		int num = 4;
		switch (num) {
		case 1:
			System.out.println("1 from :" + num);
			break;
		case 2:
			System.out.println("2 from :" + num);
			break;
		case 3:
			System.out.println("3 from :" + num);
			break;
		case 4:
			System.out.println("4 from :" + num);
		default:
			System.out.println("default: " + num);
		}
		System.out.println("*******************");

		char ch = 'b';
		switch (ch) {
		case 'd':
			System.out.println("Case1 ");
		case 'b':
			System.out.println("Case2 ");
		case 'x':
			System.out.println("Case3 ");
		case 'y':
			System.out.println("Case4 ");
		default:
			System.out.println("Default ");
		}

	}

}
