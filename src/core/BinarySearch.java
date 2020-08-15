package core;

public class BinarySearch {

    /*
    * 题目：二分查找算法
    */

    public static void main(String[] args){
        int[] array ={11,22,33,44,55,66};
        System.out.println(BinarySearch.binarySearch(array, 66));
    }

    private static int binarySearch(int[] arr,int number) {
        int start = 0, end = arr.length - 1, mid = 0;
        while (end >= start){
            mid = (start + end) / 2;
            if (number == arr[mid]){
                return arr[mid];
            }
            else if (number > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
