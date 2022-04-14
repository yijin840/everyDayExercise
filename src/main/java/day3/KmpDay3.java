package day3;

/**
 * @author wys
 * @date 2022/4/14
 */
public class KmpDay3 {

    public static int kmp(String s1, String s2) {
        int[] next = getNext(s2);
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

    private static int[] getNext(String s2) {
        int[] next = new int[s2.length() + 1];
        int i = 0;
        int j = -1;
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
