package com.ram.ds;

import java.util.ArrayList;

public class LamdaExpressionaTest {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(7);
		al.forEach(x->System.out.println(x));
	}

}
