package com.youaiduan.sorted;

public abstract class Sort {
	public abstract int[] sort(int[] arr);
	
	public static int[] swap(int[] arr, int i, int j) {
		int tmp = arr[j];
		arr[j] = arr[i];
		arr[i] = tmp;
		return arr;
	}
}
