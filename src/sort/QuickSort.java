package sort;

/**
 * 
 * @author chrisyshine@gmail.com
 * 
 * Quick Sort
 * choose a pivot, and make the left of the pivot <= pivot, and the right of the pivot >= pivot
 * Then make left part the same as the rule, and make the right part the same as the rule.
 *
 */

public class QuickSort implements Sort{
	@Override
	public void sort(int[] nums) {
		helper(nums, 0, nums.length-1);
	}
	
	private void helper(int[] nums, int start, int end) {
		if (start > end) {
			return;
		}
		
		int left = start;
		int right = end;
		int pivot = nums[start];
		
		while(left < right) {
			while(left < right && nums[right] >= pivot) {
				right--;
			}
			nums[left] = nums[right];
			while(left < right && nums[left] <= pivot) {
				left++;
			}
			nums[right] = nums[left];
		}
		nums[left] = pivot;
		
		helper(nums, start, left-1);
		helper(nums, left+1, end);
	}
}
