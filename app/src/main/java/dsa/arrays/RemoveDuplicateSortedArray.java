package dsa.arrays;

public class RemoveDuplicateSortedArray {
    public int removeDuplicates(int[] nums) {
        // [1,1,2]
        // 1, 2
        
        // 0,0,1,1,1,2,2,3,3,4]
        // 
        
           // two pointer
           // one pointer will traverse entire array
           // send pointer tracks in the insertion points 
        // 0 ,1
           int i = 0; // 1 
           int j = 1;  // 1 
           while( i < nums.length - 1){
            if( nums[i] != nums[i + 1]){
                nums[j]=nums[i + 1];
                j++;
            }
        
            i++;
           }
        
           return j;
           
        }

}
