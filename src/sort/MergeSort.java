package sort;

/**
 * 
 * @author chrisyshine@gmail.com
 * 
 * Merge Sort
 * Separate the array into 2 equal half, and sort each half
 * Then merge each half from small to big
 * 
 * Extra space is required in this implementation
 *
 */

public class MergeSort implements Sort {

	@Override
	public void sort(int[] nums) {
		sort(nums, 0, nums.length-1);
	}
	
	private void sort(int[] nums, int start, int end) {
		if (start >= end) {
			return;
		}
		int mid = start + (end - start)/2;
		sort(nums, start, mid);
		sort(nums, mid+1, end);
		merge(nums, start, mid, end);
	}
	
	private void merge(int[] nums, int start, int mid, int end) {
		// start to mid
		// mid+1 to end
		int[] temp = new int[end - start + 1];
		int i = start;
		int j = mid+1;
		int index = 0;
		while(i <= mid || j <= end) {
			if (j > end || (i <= mid && nums[i] < nums[j])) {
				temp[index++] = nums[i++];
			} else {
				temp[index++] = nums[j++];
			}
		}
		for(int k=start;k<=end;k++) {
			nums[k] = temp[k-start];
		}
	}

}
