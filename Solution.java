package squares.sortedarray;

import java.util.Arrays;

public class Solution {
    public int[] sortedSquares(int[] nums) {
        int arrLength = nums.length;
        int [] sortedArray = new int[arrLength];
        for(int i = 0; i < arrLength; i++ ){
            sortedArray[i] = nums[i] * nums[i];
        }
        Arrays.sort(sortedArray);
        return sortedArray;
    }
}
