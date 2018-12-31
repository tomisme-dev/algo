package com.youaiduan.sorted.impl;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ShellSortTest {
	private int arr[] = {51,72,2,56,89,11,23,45,256,72,3,4,5,112,34,56,54,2,345,60};

	@Test
	public void test() {
		int[] copyOfArr = Arrays.copyOf(arr, arr.length);
		Arrays.sort(copyOfArr);
		
		ShellSort shellSort = new ShellSort();
		shellSort.sort(arr);
		System.out.println(Arrays.toString(arr));
		assertArrayEquals(copyOfArr, arr);
	}

}
