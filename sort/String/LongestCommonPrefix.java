package sort.String;

import java.util.Arrays;

public class LongestCommonPrefix {

    /**
     * 最长公共前缀，这不是最优解，leecode有官方的最优解，很高级的
    */
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        Arrays.sort(strs);

        if (strs[0].equals("")) {
            return "";
        }

        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        if (s1.charAt(0) != s2.charAt(0)) {
            return "";
        }

        int n =0;
        StringBuilder sb = new StringBuilder();
        while (n < s1.length()&&s1.charAt(n) == s2.charAt(n)) {
            sb.append(s1.charAt(n++));
        }

        return sb.toString();

    }
    
}