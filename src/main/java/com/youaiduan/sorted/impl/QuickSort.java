package com.youaiduan.sorted.impl;

import com.youaiduan.sorted.Sort;

/**
 * 快速排序算法
 * */
public class QuickSort extends Sort{

	@Override
	public int[] sort(int[] arr) {
		quicklySort(arr, 0, arr.length-1);
		return arr;
	}

	public void quicklySort(int[] arr, int left, int right) {
		if(left >= right) {
			return;
		}
		
//		判断left, right, (left+right)/2三个数的中位数, 将中位数与left交换
		int half = (left+right)/2;
		int midVal = getMidVal(arr[left], arr[right], arr[half]);
		if(midVal == arr[right]) {
			swap(arr, right, left);
		} else if(midVal == arr[half]) {
			swap(arr, left, half);
		}

		int i = left;
		int j = right;
		int pivotVal = arr[left];
		boolean adjuestR = true;
		while(i<j) {
			if(adjuestR) {
				if(arr[j] < pivotVal) {
					//					如果右边的小于标准数，则调整到左边
					swap(arr, j, i);
					i++;
					adjuestR = false;
				} else {
					j--;
				}
			} else {
				if(arr[i] > pivotVal) {
					swap(arr, i, j);
					j--;
					adjuestR = true;
				} else {
					i++;
				}
			}
		}

		if(i-1-left < right-i-1) {
			//			对左半序列排序
			quicklySort(arr, left, i-1);
			//			对右半序列排序
			quicklySort(arr, i+1, right);
		} else {
			//			对右半序列排序
			quicklySort(arr, i+1, right);
			//			对左半序列排序
			quicklySort(arr, left, i-1);
		}
	}

	private int getMidVal(int a, int b, int c) {
		if((a>=b && b>=c) || (a>=b && b>=c)) {
			return b;
		} else if (b>=a && a>=c || c>=a && a>=b) {
			return a;
		} else {
			return c;
		}
	}

	public void quicklySortByMid(int[] arr, int left, int right) {
		int pivotIndex = (left+right)/2;
		int pivotValue = arr[pivotIndex];
		int i = left;
		int j = right;
		
		if(left >= right) {
			return;
		}

		while(i < j) {
			//			找到右边第一个比基准值小或等于的数
			while(i < j) {
				if(arr[j]<=pivotValue) {
					//					右边的值比基准值小时
					break;
				} else {
					j--;
				}
			}
//			找到左边第一个比基准值大或等于的数：
			while(i < j) {
				if(arr[i]>=pivotValue) {
					break;
				} else {
					i++;
				}
			}
			
			if(i < j) {
//				交换， 继续找下一对
				if(arr[i] == pivotValue && arr[j] == pivotValue) {
					i++;
//					j--;
				} else {
					swap(arr, i, j);
					if(arr[i] != pivotValue)
						i++;
					if(arr[j] != pivotValue)
						j--;
				}
			}
		}
		
		pivotIndex = i;
		quicklySortByMid(arr, left, pivotIndex-1);
		quicklySortByMid(arr, pivotIndex+1, right);
	}

}
