package com.youaiduan.sorted.impl;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class MergeSortTest {
	int[] arr1 = {3,13,24,78};
	int[] arr2 = {2,20,24,100};
	private int arr[] = {51,72,2,56,89,11,23,45,256,72,3,4,5,112,34,56,54,2,345,60};

	@Test
	public void testSort() {
//		fail("Not yet implemented");
	}

	@Test
	public void testMerge() {
		MergeSort mergeSort = new MergeSort();
		int[] copyOfArr = Arrays.copyOf(arr, arr.length);
		Arrays.sort(copyOfArr);
		
		int[] merge = mergeSort.merge(arr1, arr2);
		System.out.println(Arrays.toString(merge));
		int[] result = mergeSort.sort(arr);
		System.out.println(Arrays.toString(result));
		assertArrayEquals(result, copyOfArr);
	}

}
