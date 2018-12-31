package com.youaiduan.sorted.impl;

import com.youaiduan.sorted.Sort;


/**
 * 希尔排序，又叫缩小增量排序
 * 最佳情况：T(n) = O(nlog2 n)  最坏情况：T(n) = O(nlog2 n)  平均情况：T(n) =O(nlog2n)　
 * */
public class ShellSort extends Sort {

	@Override
	public int[] sort(int[] arr) {
		int gap = arr.length/2;
		while(gap>0) {
			//			对每组数据进行插入排序
			for(int i = gap; i < arr.length; i++) {
				int tmp = arr[i];
				for(int j = i-gap; j >=0; j=j-gap) {
					if(arr[j]>tmp) {
						swap(arr, j, j+gap);
					} else {
						break;
					}
				}
			}

			gap/=2;
		}
		return null;
	}

}
