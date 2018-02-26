package sort;

/**
 * 
 * @author chrisyshine@gmail.com
 * 
 * Bubble Sort
 * Compare number with the next one,
 * if current number is bigger than the next one, swap current number and the next one.
 * So for one time swap, the biggest number will be put at the most right position.
 * Then we start a second loop, this time, we don't need to check the last position.
 * So each time, the outer loop becomes shorter and shorter.
 * We add an extra flag to check whether there is a swap in one loop or not,
 * if there is no swap in one loop, it means that all the numbers are from small to big.
 *
 */

public class BubbleSort implements Sort{
	@Override
	public void sort(int[] nums) {
		int n = nums.length;
		for(int i=n-1;i>0;i--) {
			boolean flag = true;
			for(int j=0;j<i;j++) {
				if (nums[j] > nums[j+1]) {
					swap(nums, j, j+1);
					flag = false;
				}
			}
			if (flag) {
				break;
			}
		}
	}
	
	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
