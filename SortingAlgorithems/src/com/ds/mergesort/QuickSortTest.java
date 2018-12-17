package com.ds.mergesort;

class QuickSort {

	public static void sort(int[] arr, int low, int high) {
		if (high > low) {
			int pi = partition(arr, low, high);
			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
		}
	}
	private static int partition(int[] arr, int low, int high) {
		int pi = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] <= pi) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);

		return i + 1;
	}
	public static void swap(int[] arr, int j, int k) {
		int temp = arr[j];
		arr[j] = arr[k];
		arr[k] = temp;
	}
}

public class QuickSortTest {
	public static void main(String[] args) {
		int[] arr = {95, 30, 67,45};
		if (arr == null || arr.length == 0) {
			return;
		}
		int size = arr.length;
		QuickSort.sort(arr, 0, size - 1);

		for (int h : arr) {
			System.out.print(h + "  ");

		}
	}
}
