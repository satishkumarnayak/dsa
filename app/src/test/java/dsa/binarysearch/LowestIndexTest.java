package dsa.binarysearch;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LowestIndexTest {

    @Test
    public void testFindLowestIndex() {
        LowestIndex li = new LowestIndex();

        // Test case 1: Target is present multiple times
        int[] nums1 = {1, 2, 2, 2, 3, 4, 5};
        int target1 = 2;
        assertEquals(1, li.search(nums1, target1));

        // Test case 2: Target is present once
        int[] nums2 = {1, 2, 3, 4, 5};
        int target2 = 3;
        assertEquals(2, li.search(nums2, target2));

        // Test case 3: Target is not present
        int[] nums3 = {1, 2, 3, 4, 5};
        int target3 = 6;
        assertEquals(-1, li.search(nums3, target3));

        // Test case 4: Empty array
        int[] nums4 = {};
        int target4 = 1;
        assertEquals(-1, li.search(nums4, target4));

        // Test case 5: Single element array, target present
        int[] nums5 = {1};
        int target5 = 1;
        assertEquals(0, li.search(nums5, target5));

        // Test case 6: Single element array, target not present
        int[] nums6 = {1};
        int target6 = 2;
        assertEquals(-1, li.search(nums6, target6));
    }
}