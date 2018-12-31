package com.youaiduan.sorted.impl;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class InsertionSortTest {
	private int arr[] = {51,72,2,56,89,11,23,45,256,72,3,4,5,112,34,56,54,2,345,60};
	private int arrCopy[] = {51,72,2,56,89,11,23,45,256,72,3,4,5,112,34,56,54,2,345,60};

	@Test
	public void testSort() {
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.sort(arr);
		Arrays.sort(arrCopy);
		
		assertArrayEquals(arr, arrCopy);
	}

}
