package sort;

/**
 * 
 * @author chrisyshine@gmail.com
 * 
 * Insert Sort
 * Calculate from 0 to n-1
 * Each time, calcualte the insert position for nums[i]
 * The array from 0 to i-1 must be sorted
 *
 */

public class InsertSort implements Sort {

	@Override
	public void sort(int[] nums) {
		int n = nums.length;
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if (nums[j] > nums[i]) {
					// insert i before j
					int temp = nums[i];
					for(int k=j;k<i;k++) {
						nums[k+1] = nums[k];
					}
					nums[j] = temp;
					break;
				}
			}
		}
		
	}

}
