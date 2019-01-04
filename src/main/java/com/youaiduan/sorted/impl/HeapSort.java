package com.youaiduan.sorted.impl;

import java.util.Arrays;

import com.youaiduan.sorted.Sort;

/** 最佳情况：T(n) = O(nlogn) 最差情况：T(n) = O(nlogn) 平均情况：T(n) = O(nlogn)
 * 
 * @author duanyouai
 *
 */
public class HeapSort extends Sort {

	@Override
	public int[] sort(int[] arr) {

		//		从下向上构建大堆顶
		for(int i = arr.length/2; i >= 0; i--) {
			adjuestHeap(arr, i, arr.length);
		}
		System.out.println("===" + Arrays.toString(arr));
		
//		将堆顶与最后一个值交换, 并在此调整二叉树, 使其成为大堆顶
		int len = arr.length;
		while(len > 0) {
//			讲堆顶和最后一个数交换
			swap(arr, 0, len-1);
//			交换后重新调整堆
			len--;
			adjuestHeap(arr, 0, len);
		}
		
		return arr;
	}

	//	调整使其成为大堆顶
	private void adjuestHeap(int[] arr, int i, int len) {
		int maxIndex = i;
		
		if(i >= len) {
			return;
		}
		
		while(maxIndex < len) {
			int tmpIndex = maxIndex;
			int leftChildIndex = getLeftChildIndex(maxIndex);
			int rightChildIndex = getRightChildIndex(maxIndex);
//			右边子比父大，比左大时, 交换
			if(rightChildIndex < len && arr[rightChildIndex] >= arr[tmpIndex] && arr[rightChildIndex] >= arr[leftChildIndex]) {
				maxIndex = rightChildIndex;
			} else if(leftChildIndex < len && arr[leftChildIndex] >= arr[tmpIndex] && rightChildIndex >= len) {
//				左边大于父，且右不存在
				maxIndex = leftChildIndex;
			} else if(leftChildIndex < len && arr[leftChildIndex] >= arr[tmpIndex] 
					&& rightChildIndex < len && arr[leftChildIndex] >= arr[rightChildIndex]) {
//				左边大于父，且大于右
				maxIndex = leftChildIndex;
			}
			
			if(maxIndex != tmpIndex) {
				swap(arr, maxIndex, tmpIndex);
//				adjuestHeap(arr, maxIndex, len);
			} else {
				break;
			}
		}
		
	}


	//	获取左孩子索引
	private int getLeftChildIndex(int index) {
		return index * 2 + 1;
	}

	//	获取右孩子索引
	private int getRightChildIndex(int index) {
		return getLeftChildIndex(index) + 1;
	}


}
