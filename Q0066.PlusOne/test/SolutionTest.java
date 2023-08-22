import static org.junit.Assert.*;

public class SolutionTest {

    @org.junit.Test
    public void plusOne() {
        int[] digits = new int[] {9,9,9,9};
        int[] res = Solution.plusOne(digits);
        for(int i=0; i<res.length; i++){
            System.out.println(res[i]);
        }
    }
}