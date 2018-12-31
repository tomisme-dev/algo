package com.youaiduan.sorted.impl;

import com.youaiduan.sorted.Sort;

public class InsertionSort extends Sort{

	@Override
	public int[] sort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			int target = arr[i];
			for(int j = i-1; j >= 0; j--) {
				if(target < arr[j]) {
					swap(arr, j, j+1);
				} else {
					break;
				}
			}
		}
		return arr;
	}

}
