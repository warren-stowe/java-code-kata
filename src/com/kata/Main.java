package com.kata;

import com.kata.algorithms.sorting.BubbleSort;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] nums = new int[] { 3, 55, 1, 14, 22, 6 };
        BubbleSort.sortRecursive(nums, nums.length);
    }
}
