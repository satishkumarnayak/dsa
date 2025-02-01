package dsa.binarysearch;

public class RotatedArraySearch {

    public int search(int[] nums, int target) {


        int left = 0;    // 1 1
        int right = nums.length - 1;   //  3
        while (left <= right) {
            int mid = left + (right - left) / 2;   //  2
            if (nums[mid] == target) {  //  6
                return mid;
            }

            // left side sorted
            // if target left side sorted
            // adjust the  right pointers
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }


            // right side sorted
            // if target right side sorted
            // adjust the left pointers
        }
        return -1;

    }

}
