package day1;

/**
 * @author wys
 * @date 2022/4/12
 */
public class QuickSortDay1 {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 1, 3, 2};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }
        //基准
        int temp = arr[left];
        int i = left;
        int j = right;
        while (i != j) {
            while (arr[j] >= temp && i < j) {
                j--;
            }
            while (arr[i] <= temp && i < j) {
                i++;
            }
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        //基准归位
        arr[left] = arr[i];
        arr[i] = temp;
        quickSort(arr, left, j - 1);
        quickSort(arr, i + 1, right);
    }
}
