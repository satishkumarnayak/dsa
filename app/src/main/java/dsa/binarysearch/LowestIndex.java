package dsa.binarysearch;



public class LowestIndex {

    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int mid;
        int minIndex = Integer.MAX_VALUE;
        boolean found = false;
        while(left <= right){
            mid = left + (right - left)/2;
            if(nums[mid] == target){
                minIndex = Math.min(mid,minIndex);
                found = true;
                right = mid - 1;
            }
            if(nums[mid] > target){
                right = mid - 1;
            }
            if(nums[mid] < target){
                left = mid + 1;
            }

        }

        return found ? minIndex : -1;
    }


}
