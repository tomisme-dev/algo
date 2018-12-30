package com.youaiduan.sorted;



import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

import com.youaiduan.sorted.impl.SelectionSort;

public class SelectionSortTest {
	private int arr[] = {51,72,2,56,89,11,23,45,256,72,3,4,5,112,34,56,54,2,345,60};

	@Test
	public void testSort() {
		int[] copyOfArr = Arrays.copyOf(arr, arr.length);
		Arrays.sort(copyOfArr);
		
		SelectionSort sort = new SelectionSort();
		sort.sort(arr);
		
		assertArrayEquals(copyOfArr, arr);
		
	}

}
