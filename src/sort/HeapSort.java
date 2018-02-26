package sort;

/**
 * 
 * @author chrisyshine@gmail.com
 * 
 * At first, build the array into a MaxHeap.
 * Then, swap the first number with the end number of the array.
 * At this time, the biggest number is put to the end of the array.
 * And treate the array to be len-1.
 * And the head is not a MaxHeap just because of the top number.
 * Then make the top number fix down to the correct position.
 * Repeating swapping the first number with the new end one.
 *
 */

public class HeapSort implements Sort{
	@Override
	public void sort(int[] nums) {
		int n = nums.length;
		makeMaxHeap(nums);
		for(int len=n-1;len>0;len--) {
			swap(nums, 0, len);
			maxHeapFixDown(nums, 0, len);
		}
		
	}
	
	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	private void maxHeapFixDown(int[] nums, int i, int n) {
		while(2*i+1 < n) {
			int parent = nums[i];
			int index = i;
			
			if (nums[2*i+1] > parent) {
				index = 2*i+1;
			}
			
			if (2*i+2 < n && nums[2*i+2] > parent && nums[2*i+2] > nums[2*i+1]) {
				index = 2*i+2;
			}
			
			if (index == i) {
				break;
			} else {
				swap(nums, i, index);
				i = index;
			}
		}
	}
	
	private void makeMaxHeap(int[] nums) {
		int n = nums.length;
		for(int i=n/2-1;i>=0;i--) {
			maxHeapFixDown(nums, i, n);
		}
	}
	
	
}
