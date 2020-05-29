package algorithm.problem;

public class StringProblem {

    /**
     *  判断是否为回文串，用双指针就好了
    */
    public static boolean isPlalindrome(String s) {

        int p = 0;
        int q = s.length()-1;

        while (p<q) {
            while (!Character.isLetterOrDigit(s.charAt(p))&&p<q) {
                p++;
            }

            while (!Character.isLetterOrDigit(s.charAt(q))&&p<q) {
                q--;
            }

            if (Character.toLowerCase(s.charAt(p)) == Character.toLowerCase(s.charAt(q))) {
                p++;
                q--;
            } else {
                return false;
            }
        }

        return true;
    }


    /**
     * 找到一个最长的回文子串，该方法时用动态规划，核心思想就是s[i][j]是回文的，那么s[i+1][j+1]也是回文的。所以须要一个boolean型的二维数组来存储判断结果
     * 没找到一个长度大于之前长度的字串就记录一下起始位置和长度，当然还是须要遍历所有字串，不过有一个好处就是，比暴力解题少很多空间。
     */
    public static String longestPalindrome(String s) {

        int len = s.length();

        boolean[][] b = new boolean[len][len];


        int maxLen = 1;
        int index = 0;

        char[] c = s.toCharArray();

        for (int j = 1;j<len;j++) {
            for (int i = 0;i<j;i++) {
                if (c[i] == c[j]) {
                    b[i][j] = j-i<3?true:b[i+1][j-1];
                } else {
                    b[i][j] = false;
                }

                if (b[i][j] && j-i+1 > maxLen) {
                    index = i;
                    maxLen = j-i+1;
                }
            }
        }


        return s.substring(index, index+maxLen);
    }

    public static void main(String[] args) {
        String s = "cbbd";

        System.out.println(longestPalindrome(s));
    }
}