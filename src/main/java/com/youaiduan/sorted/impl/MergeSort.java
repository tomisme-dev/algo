package com.youaiduan.sorted.impl;

import java.util.Arrays;

import com.youaiduan.sorted.Sort;

/**
 * 归并排序
 * T(n) = O(n)  最差情况：T(n) = O(nlogn)  平均情况：T(n) = O(nlogn)
 * 和选择排序一样，归并排序的性能不受输入数据的影响，但表现比选择排序好的多，因为始终都是O(n log n）的时间复杂度。代价是需要额外的内存空间。
 * */
public class MergeSort extends Sort {

	@Override
	public int[] sort(int[] arr) {
		if(arr.length == 1) {
			return arr;
		}
		
		int mid = arr.length/2;
//		先将左边排序好
		int[] sortedLeft = sort(Arrays.copyOfRange(arr, 0, mid));
//		再讲右边排序好
		int[] sortedRight = sort(Arrays.copyOfRange(arr, mid, arr.length));
//		将排序好的合并
		int[] result = merge(sortedLeft, sortedRight);
		return result;
	}
	
	/**
	 * 
	 * 讲连个排序好的自序按顺序 合并
	 * */
	public int[] merge(int[] left, int[] right) {
		int[] target = new int[left.length + right.length];
		target[0] = Math.min(left[0], right[0]);

		int index = 0;
		int iLeft = 0;
		int iRight = 0;	

		while(index < target.length) {
			if(iLeft < left.length && (iRight >= right.length || left[iLeft] < right[iRight])) {
				target[index++] = left[iLeft++];
			} else {
				target[index++] = right[iRight++];
			}
		}
		return target;
	}

}
