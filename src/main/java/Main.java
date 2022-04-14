import day2.KmpDay2;
import day3.KmpDay3;
import day3.QuickSortDay3;

/**
 * @author wys
 * @date 2022/4/13
 */
public class Main {
    public static void main(String[] args) {
        String s1 = "abcaabcdefgabc";
        String s2 = "cde";
        System.out.println(KmpDay3 .kmp(s1, s2));
        int arr[] = new int[]{5, 1, 3, 2, 4};
        QuickSortDay3.quickSort(arr, 0, arr.length - 1);
        printArr(arr);

    }

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
