public class SolutionTest {

    @org.junit.Test
    public void check2Test() {
        int[] nums = {2, 100};

        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }

        int res = Solution.check2(nums);
        System.out.println(res);
    }
}