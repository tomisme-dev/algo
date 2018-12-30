package com.youaiduan.sorted.impl;

import com.youaiduan.sorted.Sort;

/**
 * ð������
 * */
public class BubbleSort extends Sort {

	@Override
	public int[] sort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 1; j < arr.length - i; j++) {
//				�����ǰ����ǰһ��Сʱ, �򽻻�
				if(arr[j] < arr[j-1]) {
					swap(arr, j, j-1);
				}
			}
		}
		return arr;
	}
}
