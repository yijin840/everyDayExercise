package day3;

/**
 * @author wys
 * @date 2022/4/14
 */
public class QuickSortDay3 {

    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int temp = arr[left];
        int i = left, j = right;
        while (i != j) {
            while (arr[j] >= temp && i < j) {
                j--;
            }
            while (arr[i] <= temp && i < j) {
                i++;
            }
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
        arr[left] = arr[i];
        arr[i] = temp;
        quickSort(arr, left, j - 1);
        quickSort(arr, i + 1, right);
    }

}
