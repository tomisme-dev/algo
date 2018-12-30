package com.youaiduan.sorted;


import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest {
	private int arr[] = {51,72,2,56,89,11,23,45,256,72,3,4,5,112,34,56,54,2,345,60};
//	private int arr[] = {3,3,3,3,3,3,3,3};

	@Test
	public void testSort() {
//		fail("Not yet implemented");
	}

	@Test
	public void testQuicklySort() {
		QuickSort quickSort = new QuickSort();
		quickSort.quicklySort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	@Test
	public void testQuicklySortByMid() {
		int[] copyOfArr = Arrays.copyOf(arr, arr.length);
		
		QuickSort quickSort = new QuickSort();
		quickSort.quicklySortByMid(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(copyOfArr);
		Assert.assertArrayEquals(arr, copyOfArr);
	}

}
