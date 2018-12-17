package com.ds.mergesort;

class MergeSortAlgorithem {
	public static void divide(int arr[]) {
		if (arr == null || arr.length < 2) {
			return;
		}
		int n = arr.length;

		int mid = n / 2;

		int[] left = new int[mid];

		int[] right = new int[n - mid];

		for (int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}
		for (int i = mid; i < n; i++) {
			right[i - mid] = arr[i];
		}
		divide(left);
		divide(right);
		sortConquer(arr, left, right, left.length, right.length);
	}

	public static void sortConquer(int[] arr, int[] leftArr, int[] rightArr, int leftLength, int rightLength) {

		for (int x : leftArr) {
			System.out.print(x + " ");
		}
		System.out.print("|| ");
		for (int x : rightArr) {
			System.out.print(x + " ");
		}
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < leftLength && j < rightLength) {
			if (leftArr[i] < rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		while (i < leftLength) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		while (j < rightLength) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}

		System.out.print("<==>  ");
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

}

public class MergeSortTest {
	public static void main(String[] args) {
		int[] a = { 5, 1, 6, 2 };
		MergeSortAlgorithem.divide(a);
		System.out.println("**********************************************");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");

	}
}
