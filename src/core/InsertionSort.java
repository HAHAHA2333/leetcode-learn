package core;

public class InsertionSort {

    /*
    * 插入排序
    * */

    public static int[] insertSort(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            int insertValue = nums[i];
            int index = i - 1;
            while (index >= 0 && nums[index] > insertValue){
                nums[index + 1] = nums[index];
                --index;
            }
            nums[index + 1] = insertValue;
        }
        return nums;
    }
}
