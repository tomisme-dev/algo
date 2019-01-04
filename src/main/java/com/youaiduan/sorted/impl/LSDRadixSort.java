package com.youaiduan.sorted.impl;

import com.youaiduan.sorted.Sort;

/**
 * 
 *	基数排序的发明可以追溯到1887年赫尔曼·何乐礼在打孔卡片制表机（Tabulation Machine）, 排序器每次只能看到一个列。
 *	它是基于元素值的每个位上的字符来排序的。 对于数字而言就是分别基于个位，十位， 百位或千位等等数字来排序。

 *	基数排序（Radix sort）是一种非比较型整数排序算法，其原理是将整数按位数切割成不同的数字，然后按每个位数分别比较。
 *	由于整数也可以表达字符串（比如名字或日期）和特定格式的浮点数，所以基数排序也不是只能使用于整数。
 *  LSD （Least significant digital）从最右侧低位开始进行排序。先从kd开始排序，再对kd-1进行排序，依次重复，直到对k1排序后便得到一个有序序列。LSD方式适用于位数少的序列。
 * 
 * */

public class LSDRadixSort extends Sort {

	@Override
	public int[] sort(int[] arr) {
		//		找到最大数
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}


		//		计算最大数有多少位
		int base = 10;
		int maxDigit = 0;
		while(max > 0) {
			maxDigit++;
			max = max/base;
		}

		//		创建桶二位数组
		int[][] bucket = new int[base][arr.length];
		int[] buckLen = new int[base];
		//		根据最大数位数执行分发装桶与收集
		for(int i=0; i < maxDigit; i++) {
			int divideVal = 1;
			for(int m=0; m< i; m++) {
				divideVal *= base;
			}
			//			将桶长度清0
			for(int n = 0; n < buckLen.length; n++) {
				buckLen[n] = 0;
			}

			//			将数据分发装桶
			for(int j=0; j < arr.length; j++) {
				//				找到当前数的第i位
				int whichBacket = arr[j] / divideVal % base;
				int len = buckLen[whichBacket];
				bucket[whichBacket][len] = arr[j];
				buckLen[whichBacket]++;
			}

			//			桶中的数据收集回来
			int index = 0;
			for(int k = 0; k < bucket.length; k++) {
				for(int j =0; j < buckLen[k];j++) {
					arr[index++] = bucket[k][j];
				}
			}
		}

		return arr;
	}

}
