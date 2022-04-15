package day4;

/**
 * @author wys
 * @date 2022/4/15
 */
public class KmpDay4 {

    public static int kmp(String s1, String s2) {
        int[] next = next(s2);
        int i = 0;
        int j = 0;
        while (i < s1.length() && j < s2.length()) {
            if (j == -1 || s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if (j >= s2.length()) {
            return i - j;
        } else {
            return -1;
        }
    }

    private static int[] next(String s2) {
        int i = 0;
        int j = -1;
        int[] next = new int[s2.length() + 1];
        next[0] = -1;
        while (i < s2.length()) {
            if (j == -1 || s2.charAt(i) == s2.charAt(j)) {
                ++i;
                ++j;
                next[i] = j;
            } else {
                j = next[j];
            }
        }
        return next;
    }

}
