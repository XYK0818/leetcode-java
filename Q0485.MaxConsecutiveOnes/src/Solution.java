public class Solution {
    public static void main (String [] args ) {
        int count = 0;
        int largest = 0;
        int[] array = new int[]{1, 1, 0, 1, 0, 1, 1, 1, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1){
                count++;
            } else {
                count  = 0;
                largest=Math.max(largest, count);
            }
            largest=Math.max(largest, count);
        }
        System.out.println(largest);
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0, maxSum = 0;
        for(int n : nums) {
            sum += n;
            sum *= n;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

}
