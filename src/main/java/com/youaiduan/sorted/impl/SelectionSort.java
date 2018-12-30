package com.youaiduan.sorted.impl;

import com.youaiduan.sorted.Sort;

/**
 * 选择排序
 * 2.4 算法分析
最佳情况：T(n) = O(n2)  最差情况：T(n) = O(n2)  平均情况：T(n) = O(n2)
 * 
 * */
public class SelectionSort extends Sort {

	@Override
	public int[] sort(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			int targetIndex = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[targetIndex] > arr[j]) {
					targetIndex = j;
				}
			}
			if(targetIndex != i) {
				swap(arr, i, targetIndex);
			}
		}
		return null;
	}

}
