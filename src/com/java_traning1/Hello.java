package com.java_traning1;

import java.util.Arrays;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,8,9,22,35,99};
		System.out.println(Arrays.toString(nums));
		reverseArray(nums);
		 System.out.println(Arrays.toString(nums));
	}

	private static void reverseArray(int[] nums) {
		// TODO Auto-generated method stub
		for(int i= 0; i < nums.length/2; i++) {
			swapArray(nums, i, nums.length -i -1);
		}
	}

	private static void swapArray(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
		
	}

}
