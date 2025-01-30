package dsa.binarysearch;

public class BinarySearch {

    public int search(int[] nums, int target) {


        int left = 0;
        int right = nums.length - 1;
        int mid = left + (right - left)/2 ;
  
        while(left <= right){
            if(target == nums[mid]){
                return mid;
            }
            else if(target > nums[mid]){
                left = mid + 1; 
                mid = (left  + right)/2;
            } else {
                right = mid - 1;
                mid = (left + right)/2;
            }

        }

        return -1;

        
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;
        int result = bs.search(nums, target);
        System.out.println("Index of target " + target + ": " + result); // Output: 6
    }

}
