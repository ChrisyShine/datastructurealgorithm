package binarysearch;

/**
 * 
 * @author chrisyshine@gmail.com
 * Find the median of the two sorted arrays
 *
 */
public class FindMedian {
	public double findMedian(int[] nums1, int[] nums2) {
		int m = nums1.length;
        int n = nums2.length;
        if (m > n) {
            return findMedian(nums2, nums1);
        }
        int left = 0;
        int right = 2*m;
        
        while(left <= right) {
//            System.out.println(left + ", " + right);
            int mid1 = left + (right-left)/2;
            int mid2 = m + n - mid1;
            
            int midLeft1 = mid1 == 0 ? Integer.MIN_VALUE : nums1[(mid1-1)/2];
            int midRight1 = mid1 == 2*m ? Integer.MAX_VALUE: nums1[mid1/2];
            int midLeft2 = mid2 == 0 ? Integer.MIN_VALUE: nums2[(mid2-1)/2];
            int midRight2 = mid2 == 2*n ? Integer.MAX_VALUE: nums2[mid2/2];
            
            if (Math.max(midLeft1, midLeft2) <= Math.min(midRight1, midRight2)) {
                return (double)(Math.max(midLeft1, midLeft2) + Math.min(midRight1, midRight2))/2;
            } else if (midRight1 < midLeft2){
                left = mid1+1;
            } else {
                right = mid1-1;
            }
        }
        return 0;
	}
	
	public static void main(String[] args) {
		int[] nums1 = new int[]{3};
		int[] nums2 = new int[]{1,2,4};
		System.out.println(new FindMedian().findMedian(nums1, nums2));
		nums1 = new int[]{1,3};
		nums2 = new int[]{2};
		System.out.println(new FindMedian().findMedian(nums1, nums2));
		nums1 = new int[]{1,2};
		nums2 = new int[]{3,4};
		System.out.println(new FindMedian().findMedian(nums1, nums2));
		nums1 = new int[]{3,4};
		nums2 = new int[]{1,2,5};
		System.out.println(new FindMedian().findMedian(nums1, nums2));
		nums1 = new int[]{};
		nums2 = new int[]{1};
		System.out.println(new FindMedian().findMedian(nums1, nums2));
	}
}
