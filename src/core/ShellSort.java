package core;

import java.util.Arrays;

public class ShellSort {
    /*
    * 希尔排序
    * */

    private static int[] shellSort(int[] array){
        int dk = array.length / 2;
        while (dk > 0){
            shellInsertSort(array,dk);
            dk = dk / 2;
        }
        return array;
    }

    private static void shellInsertSort(int[] array, int dk){
        for (int i = dk; i < array.length; ++i){
            int insertValue = array[i];
            int index = i - dk;
            while (index >= 0 && array[index] > insertValue){
                array[index + dk] = array[index];
                index -= dk;
            }
            array[index + dk] = insertValue;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shellSort(new int[]{21,16,8,52,4,39})));
    }
}
