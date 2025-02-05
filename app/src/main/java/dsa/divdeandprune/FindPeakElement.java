package dsa.divdeandprune;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        // Binary search to find a peak
        while (left < right) {
            int mid = left + (right - left) / 2; // Avoids overflow

            // Compare mid with its right neighbor
            if (nums[mid] < nums[mid + 1]) {
                // If mid is less than its right neighbor, peak is on the right
                left = mid + 1;
            } else {
                // Otherwise, peak is on the left (including mid)
                right = mid;
            }
        }

        // When left == right, we have found a peak
        return left;
    }

    public static void main(String[] args) {
        FindPeakElement solution = new FindPeakElement();
        int[] nums = {1, 2, 3, 1};
        System.out.println("Peak element index: " + solution.findPeakElement(nums)); // Output: 2
    }
}