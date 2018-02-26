package sort;

/**
 * 
 * @author chrisyshine@gmail.com
 * 
 * Select Sort
 * Each time, select the smallest one and put it to the head of the array
 * Each time, the head of the array will plus one
 *
 */

public class SelectSort implements Sort {

	@Override
	public void sort(int[] nums) {
		int n = nums.length;
		for(int i=0;i<n;i++) {
			int min = Integer.MAX_VALUE;
			int minIndex = -1;
			for(int j=i;j<n;j++) {
				if (nums[j] < min) {
					min = nums[j];
					minIndex = j;
				}
			}
			if (minIndex != i) {
				swap(nums, i, minIndex);
			}
		}

	}

	
	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
