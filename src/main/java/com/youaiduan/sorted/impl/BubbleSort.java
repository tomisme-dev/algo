package com.youaiduan.sorted.impl;

import com.youaiduan.sorted.Sort;

/**
 * 冒泡排序算法
算法分析
最佳情况：T(n) = O(n)   最差情况：T(n) = O(n2)   平均情况：T(n) = O(n2)
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
