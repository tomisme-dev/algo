package com.youaiduan.sorted;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import com.youaiduan.sorted.impl.BubbleSort;

public class BubbleSortTest {
	private int arr[] = {4,3,2,56,89,11,23,45,256,2,3,4,5,112,34,56,54,2,345};

	@Test
	public void testSort() {
		BubbleSort bubbleSort = new BubbleSort();
		int[] copyOfArr = Arrays.copyOf(arr, arr.length);
		bubbleSort.sort(arr);
		Arrays.sort(copyOfArr);
		Assert.assertArrayEquals(arr, copyOfArr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copyOfArr));
	}

	@Test
	public void testSwap() {
//		fail("Not yet implemented");
	}

}
