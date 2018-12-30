package com.youaiduan.sorted;

/**
 * 冒泡排序
 * */
public class BubbleSort extends Sort {

	@Override
	public int[] sort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 1; j < arr.length - i; j++) {
//				如果当前数比前一个小时, 则交换
				if(arr[j] < arr[j-1]) {
					swap(arr, j, j-1);
				}
			}
		}
		return arr;
	}
}
