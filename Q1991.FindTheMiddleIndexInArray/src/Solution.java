public class Solution {
    public static int findMiddleIndex(int[] nums) {
        int totalsum = 0;
        int leftsum = 0;

        // loop through the nums array to find the sum of all elements
        for(int i=0; i<=nums.length-1; i++){
            totalsum = totalsum + nums[i];
        }

        // loop through the nums array
        // find if the index is the middle
        // think about how to find if the index is middle
        for(int i=0; i<=nums.length-1; i++){
            if(2*leftsum == totalsum-nums[i]){
                return i;
            }
            leftsum = leftsum + nums[i];
        }

        return -1;
    }
}
