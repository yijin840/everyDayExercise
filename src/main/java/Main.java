import day2.KmpDay2;

/**
 * @author wys
 * @date 2022/4/13
 */
public class Main {
    public static void main(String[] args) {
        String s1 = "abcaabcdefgabc";
        String s2 = "cde";
        System.out.println(KmpDay2.kmp(s1, s2));
    }
}
