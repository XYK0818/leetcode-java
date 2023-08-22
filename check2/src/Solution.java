public class Solution {
    public static int check2(int[] nums){
        int count = 0;
        for(int i=nums[0]; i<=nums[1]; i++){
            String str_i = Integer.toString(i);
            for (int j=0; j<str_i.length(); j++){
                if(str_i.charAt(j) == '2'){
                    count++;
                }
            }
        }
        return count;
    }
}
