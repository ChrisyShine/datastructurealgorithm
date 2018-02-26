package binarysearch;

/**
 * 
 * @author chrisyshine@gmail.com
 * 
 * nums is a sorted array
 * find the insert position of target
 * if target < min(nums), return 0;
 * if target > max(nums), return nums.length;
 * if target is between 2 nums, return the index of the larger one
 *
 */
public class FindInsertPosition {
	public int findInsertPosition(int[] nums, int target) {
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
		return left;
	}
	
	public static void main(String[] args) {
		int[] nums = new int[]{1,3,5,7};
		System.out.println(new FindInsertPosition().findInsertPosition(nums, 0));
		System.out.println(new FindInsertPosition().findInsertPosition(nums, 1));
		System.out.println(new FindInsertPosition().findInsertPosition(nums, 2));
		System.out.println(new FindInsertPosition().findInsertPosition(nums, 3));
		System.out.println(new FindInsertPosition().findInsertPosition(nums, 7));
		System.out.println(new FindInsertPosition().findInsertPosition(nums, 9));
	}
}
