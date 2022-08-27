package com.kata.algorithms.sorting;

public class BubbleSort {

    /**
     * Implementation of Bubble Sort algorithm.  The inner for-loop checks nums[i] > nums[i + 1]
     * and swaps the numbers if true.  This causes the highest value to "bubble up" to the end
     * of the array.  This pass is made repeatedly via an outer for-loop.  An int value, swaps, counts
     * every swap that occurs within the inner loop and terminates the program if swaps = 0 (i.e., the
     * list is sorted without the outer loop completing)
     * @param nums an array of unsorted numbers
     * @return an array of sorted numbers from input param
     */
    public static Integer[] sort(Integer[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {
            int swaps = 0;

            for (int j = 0, k = 1; j < nums.length - 1; j++, k++) {
                if (nums[j] > nums[k]) {
                    swap(nums, j, k);
                    swaps++;
                }
            }
            if (swaps == 0) break;
        }
        return nums;
    }

    public static void sortRecursive(Integer[] nums, int pos) {

        if (nums.length == 1) return;

        int swaps = 0;

        for (int i = 0; i < pos - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                swap(nums, i, i + 1);
                swaps++;
            }
        }

        if (swaps == 0) return;

        sortRecursive(nums, pos - 1);

    }

    private static void swap(Integer[] nums, int f, int s) {
        int temp = nums[f];
        nums[f] = nums[s];
        nums[s] = temp;
    }
}
