package day1;

/**
 * @author wys
 * @date 2022/4/12
 */
public class KmpDay1 {
    private int[] next;

    public static void main(String[] args) {
        KmpDay1 day1 = new KmpDay1();
        String s1 = "abcaabcdefgabc";
        String s2 = "cde";
        System.out.println(day1.kmp(s1, s2));
    }

    private int kmp(String str, String childStr) {
        getNext(childStr);
        int i = 0;
        int j = 0;
        while (i < str.length() && j < childStr.length()) {
            if (j == -1 || str.charAt(i) == childStr.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if (j == childStr.length()) {
            return i - j;
        } else {
            return -1;
        }
    }

    private void getNext(String childStr) {
        next = new int[childStr.length() + 1];
        int i = 0;
        int j = -1;
        next[0] = -1;
        while (i < childStr.length()) {
            if (j == -1 || childStr.charAt(i) == childStr.charAt(j)) {
                ++i;
                ++j;
                next[i] = j;
            } else {
                j = next[j];
            }
        }

    }


}
