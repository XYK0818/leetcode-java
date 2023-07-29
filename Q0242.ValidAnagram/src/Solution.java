public class Solution {
    public boolean isAnagram(String s, String t) {
        // check if the length of s and t are the same.
        // if not, they can't be anagram. return false
        if (s.length() != t.length()) {
            return false;
        }

        // loop through both s for each letter increase the occurrence by 1
        // loop through both t for each letter decrease the occurrence by 1
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        // loop through the occurrence array.
        // if it contains non-zero value,
        // it means that some letter's number of occurrence is not even up, return false
        // otherwise, if all values in the array is zero, return True
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
