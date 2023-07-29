import static org.junit.Assert.*;

public class SolutionTest {
    @org.junit.Test
    public void test() {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(Solution.isAnagram(s, t));
    }

    @org.junit.Test
    public void test2() {
        String s = "rat";
        String t = "car";

        System.out.println(Solution.isAnagram(s, t));
    }
}