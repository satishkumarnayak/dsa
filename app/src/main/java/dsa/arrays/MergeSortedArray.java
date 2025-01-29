package dsa.arrays;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // [1,2,3,0,0,0], m = 3, nums2 = [2,5,6]   i  0 1 2 3 4 5
         //  j 0  1 2               k 0
         // aux  1,2 2 3 
        
            int p1 = m - 1;     // pointer  for nums1
            int p2 = n - 1;     // pointer for nums2
            int p3 = m + n - 1;     // pointer for merged array 
        
          // begin from end start mergeing the array 
            while( p1 >= 0 && p2 >= 0){
        
                if(nums1[p1] > nums2[p2]){
                    nums1[p3] = nums1[p1];
                    p1--;
                } else {
                    nums1[p3] = nums2[p2];
                    p2--;
                }
                p3--;
            }
        
           // if p2 still having elements after merge, copy them 
            while(p2 >= 0){
                nums1[p3]=nums2[p2];
                p2--;
            }
             
        
                
            }
}
