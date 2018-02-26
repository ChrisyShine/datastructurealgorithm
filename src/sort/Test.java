package sort;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
//		int[] a = new int[] {3,5,7,9,1,2,4,10,6,8};
		
		int[] a = new int[100];
		int[] b = new int[100];
		Random random = new Random();
		for(int i=0;i<100;i++) {
			a[i] = random.nextInt(50);
			b[i] = a[i];
		}
		
//		int[] a = new int[] {1,0,1,0,1,0,0,1,1,2,2,0,0,2,1,0,2,0};
		
		Sort sort = new InsertSort();
		System.out.println(sort.getClass().getName());
		sort.sort(a);
		boolean result = checkSort(a);
		printArray(b);
		System.out.println(result);
		if (!result) {
			printArray(a);
		}
	}
	
	public static void printArray(int[] a) {
		for(int num:a) {
			System.out.print(num + ", ");
		}
		System.out.println("");
	}
	
	public static boolean checkSort(int[] nums) {
		for(int i=0;i<nums.length-1;i++) {
			if (nums[i] > nums[i+1]) {
				return false;
			}
		}
		return true;
	}
}
