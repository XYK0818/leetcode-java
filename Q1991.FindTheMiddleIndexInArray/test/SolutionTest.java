import static org.junit.Assert.*;

public class SolutionTest {

    @org.junit.Test
    public void findMiddleIndex() {
        int[] nums = {2,3,-1,8,4};

        int actualResult = Solution.findMiddleIndex(nums);

        System.out.println("result is: " + actualResult);

    }



    @org.junit.Test
    public void findMiddleIndexTest2() {
        int[] nums = {1,-1,4};

        int actualResult = Solution.findMiddleIndex(nums);

        System.out.println("result is: " + actualResult);

    }
}