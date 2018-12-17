package com.ram;

import java.util.Arrays;

public class ReverseArrayInJava {
	public static void main(String[] args) {
		int[] arr= {0,9,3,1,6,8};
		int length=arr.length;
		for(int i=0;i<length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[length-1-i];
			arr[length-1-i]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
