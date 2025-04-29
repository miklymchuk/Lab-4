package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 2, 1, 4};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int store = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = store;
                }
            }
        }
    }

    /*
    315214
    135214
    113524
    112534
    112354
    112345
     */

    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int min = i;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }

            int store = nums[i];
            nums[min] = store;
            nums[min] = store;
        }
    }
}