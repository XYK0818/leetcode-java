import static org.junit.Assert.*;

public class SolutionTest {

    @org.junit.Test
    public void isValid() {

        String s = "{{{}}}[[[]]]{([)]}";
        System.out.println(Solution.isValid(s));
        System.out.println(Solution.isValidArrayList(s));

    }
}