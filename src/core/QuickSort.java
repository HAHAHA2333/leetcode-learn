package core;

public class QuickSort {
    /*
    * 快速排序
    * */

    private static int[] quickSort(int[] array, int low, int high){
        int start = low, end = high, key = array[low];
        while (end > start){
            while (end > key && key <= array[end])
                end--;
            if (key >= array[end]){
                int temp = array[end];
                array[end] = array[start];
                array[start] = temp;
            }
            while (end > key && key >= array[start])
                start++;
            if (key <= array[start]){
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
            }
        }
        if (start > low)
            quickSort(array, low, start - 1);
        if (end < high)
            quickSort(array, end + 1, high);
        return array;
    }
}
