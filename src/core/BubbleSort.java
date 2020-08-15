package core;

import java.util.Arrays;

public class BubbleSort {

    /*
    * 题目：冒泡排列算法
    * */

    public static void main(String[] args) {
        int[] array = {95,22,66,34,45,71,12};
        System.out.println(Arrays.toString(BubbleSort.bubbleSort(array)));
    }

    private static int[] bubbleSort(int[]array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
