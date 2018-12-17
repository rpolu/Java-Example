package com.ram;

public class ReverseWordinString {
	public static void main(String[] args) {
		String input = "ramamohan";
		byte[] byteArr = input.getBytes();
		byte[] newByteArray = new byte[byteArr.length];
		for (int i = 0; i < byteArr.length; i++) {
			newByteArray[i] = byteArr[(byteArr.length - i) - 1];
		}
		System.out.println(new String(newByteArray));
	}
}
