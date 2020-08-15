package core;

public class MergeSort {

    /*
    * 归并排序
    * */

    public static int[] mergesort(int[] data){
        sort(data, 0, data.length - 1);
        return data;
    }

    public static void sort(int[] data, int left, int right){
        if (left >= right){
            return;
        }
        int center = (left + right) / 2;
        sort(data, left, center);
        sort(data, center + 1, right);
        merge(data, left, center, right);
    }

    public static void merge(int[] data,int left, int center, int right){
        int[] tempArr = new int[data.length];
        int index = left;
        int tempIndex = left;
        int mid = center + 1;
        while (left <= center && mid <= right){
            if (data[left] <= data[mid]){
                tempArr[index++] = data[left++];
            }
            else{
                tempArr[index++] = data[mid++];
            }
        }

        while (left <= center){
            tempArr[index++] = data[left++];
        }

        while (mid <= right){
            tempArr[index++] = data[mid++];
        }
        while (tempIndex <= left){
            data[tempIndex] = tempArr[tempIndex++];
        }
    }
}
