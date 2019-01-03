package com.youaiduan.sorted.impl;

import com.youaiduan.sorted.Sort;

public class HeapSort extends Sort {

	@Override
	public int[] sort(int[] arr) {

		//		从下向上构建大堆顶
		for(int i = arr.length/2; i >= 0; i--) {
			int leftChildIndex = getLeftChildIndex(i);
			int rightChildIndex = getRightChildIndex(i);

//			子比父大时, 交换
			if(leftChildIndex < arr.length && arr[leftChildIndex] > arr[i]) {
				
				swap(arr, leftChildIndex, i);
			}
			
//			子比父大时, 交换
			if(rightChildIndex < arr.length && arr[rightChildIndex] > arr[i]) {
				swap(arr, rightChildIndex, i);
			}
		}
		
//		将堆顶与最后一个值交换, 并在此调整二叉树, 使其成为大堆顶
		
		
		
		return null;
	}

	//	大堆顶构建
	private void heapSort(int[] arr, int i) {

	}


	//	获取左孩子索引
	private int getLeftChildIndex(int index) {
		return index * 2 + 1;
	}

	//	获取右孩子索引
	private int getRightChildIndex(int index) {
		return getLeftChildIndex(index) + 1;
	}

	private int getLeftChildValue(int[] arr, int index) {
		return arr[getLeftChildIndex(index)];
	}

	private int getRightChildValue(int[] arr, int index) {
		return arr[getRightChildIndex(index)];
	}

	private boolean hasLeftChild(int[] arr, int index) {
		return getLeftChildIndex(index) < arr.length;
	}

	private boolean hasRightChild(int[] arr, int index) {
		return getRightChildIndex(index) < arr.length;
	}


}
