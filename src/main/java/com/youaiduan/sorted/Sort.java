package com.youaiduan.sorted;

/**
 * <img class="fancybox-image" src="https://itimetraveler.github.io/gallery/sort-algorithms/big-o.png" alt="">
 * https://itimetraveler.github.io/2017/07/18/%E5%85%AB%E5%A4%A7%E6%8E%92%E5%BA%8F%E7%AE%97%E6%B3%95%E6%80%BB%E7%BB%93%E4%B8%8Ejava%E5%AE%9E%E7%8E%B0/#%E5%85%AB%E3%80%81%E5%9F%BA%E6%95%B0%E6%8E%92%E5%BA%8F%EF%BC%88Radix-Sort%EF%BC%89
 * */
public abstract class Sort {
	public abstract int[] sort(int[] arr);
	
	public static int[] swap(int[] arr, int i, int j) {
		int tmp = arr[j];
		arr[j] = arr[i];
		arr[i] = tmp;
		return arr;
	}
}
