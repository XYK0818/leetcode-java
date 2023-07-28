import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1() {

        int[] nums = new int[] {2, 7, 11, 15};
        int target = 9;
        int[] expected_result = new int[] {0, 1};
        int[] actual_result = Solution.twoSumBruteForce(nums, target);

        System.out.println("expected result is: " + Arrays.toString(expected_result));
        System.out.println("actual result is: " + Arrays.toString(actual_result));

    }
    @Test
    public void test2() {

        int[] nums = new int[] {3, 2, 4};
        int target = 6;
        int[] expected_result = new int[] {1, 2};

        assertArrayEquals(expected_result, Solution.twoSumHashMap(nums, target));

    }
}