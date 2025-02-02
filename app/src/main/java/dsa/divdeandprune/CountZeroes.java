package dsa.divdeandprune;

public class CountZeroes {

    int countZeroes(int[] arr) {

        int left = 1;
        int right = arr.length - 1;

        int firstZeroIndex= 0;
        while(left <= right) {

            int mid = left + (right - left)/2;

            if(arr[mid] == 0){   // 1
                if(arr[mid - 1] > 0){
                    firstZeroIndex = mid;
                    break;
                }
                else if(arr[mid - 1] == 0){
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                left = mid + 1 ;
            }
        }

        return arr.length - firstZeroIndex;


    }
}
