import static org.junit.Assert.*;

public class SolutionTest {

    @org.junit.Test
    public void checkIfExist() {
        int[] arr= new int[] {10, 2, 5, 3};
        boolean res = Solution.checkIfExist(arr);
        System.out.println(res);
    }

    @org.junit.Test
    public void checkIfExist2() {
        int[] arr= new int[] {3, 1, 7, 11};
        boolean res = Solution.checkIfExist(arr);
        System.out.println(res);
    }
}