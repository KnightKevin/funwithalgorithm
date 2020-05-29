package sort.String;

import java.util.HashSet;
import java.util.Set;

/**
 * 最长回文串的长度，想法很巧妙
*/
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        Set<Character> set = new HashSet<>();

        int n = 0;
        for (char i : s.toCharArray()) {
            if (!set.contains(i)) {
                set.add(i);
            } else {
                n++;
                set.remove(i);
            }
        }

        return set.isEmpty()?n*2:n*2+1;
    }

    public static void main(String[] args) {
        LongestPalindrome o = new LongestPalindrome();

        String s = "abccccdd";

        System.out.println(o.longestPalindrome(s));
    }
}