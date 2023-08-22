import static org.junit.Assert.*;

public class SolutionTest {

    @org.junit.Test
    public void validMountainArrayFor() {
        int[] arr = new int[] {1,2,3,4,5,2,1};
        System.out.println(Solution.validMountainArrayFor(arr));
    }

    @org.junit.Test
    public void validMountainArrayWhile() {
        int[] arr = new int[] {1,2,3,4,5,2,1};
        System.out.println(Solution.validMountainArrayWhile(arr));
    }

}