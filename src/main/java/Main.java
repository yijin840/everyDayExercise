import day2.KmpDay2;
import day3.KmpDay3;
import day3.QuickSortDay3;
import day4.KmpDay4;
import day4.QuickSortDay4;
import day5.KmpDay5;
import day5.QuickSortDay5;
import day6.KmpDay6;
import day6.QuickSortDay6;

/**
 * @author wys
 * @date 2022/4/13
 */
public class Main {
    public static void main(String[] args) {
        String s1 = "abcaabcdefgabc";
        String s2 = "cde";
        System.out.println(KmpDay6.kmp(s1, s2));
        int arr[] = new int[]{5, 1, 3, 2, 4};
        QuickSortDay6.quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
