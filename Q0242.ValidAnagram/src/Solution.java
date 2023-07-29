public class Solution {
    public boolean isAnagram(String s, String t) {
        // check if the length of s and t are the same.
        // if not, they can't be anagram. return false
        if (<something>) {
            <something>
        }

        // create an array of integers to represent the number of occurrence of each letter
        int[] freq = <something>;

        // loop through both s for each letter increase the occurrence by 1
        // loop through both t for each letter decrease the occurrence by 1
        <something>

        // loop through the occurrence array.
        // if it contains non-zero value,
        // it means that some letter's number of occurrence is not even up, return false
        // otherwise, if all values in the array is zero, return True
        <something>

        return true;
    }
}
