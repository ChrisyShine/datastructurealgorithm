package binarysearch;

/**
 * @author chrisyshine@gmail.com
 * nums is a sorted array from small to big
 * give a target number
 * find the index of target number in nums
 * if there is no such number in nums, return -1
 *
 */

public class FindTarget {
	public int findTarget(int[] nums, int target) {
		int left = 0;
		int right = nums.length-1;
		while(left <= right) {
			int mid = left + (right - left)/2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				left = mid+1;
			} else {
				right = mid-1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] nums = new int[]{1,3,5,7,9};
		System.out.println(new FindTarget().findTarget(nums, 10));
	}
}
