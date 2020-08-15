package sample.topic7;

public class Solution02 {

    /*
     * 题目：多数元素 - 摩尔投票法思路
     * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素(多数元素个数 > 数组长度 / 2)。
     * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
     *
     * 输入：[3,2,3]
     * 输出：3
     *
     * 输入：[2,2,1,1,1,2,2]
     * 输出：2
     * */

    private int majorityElement(int[] nums) {
        int candNum = nums[0],count = 1;
        for (int i = 1; i < nums.length; ++i){
            if (nums[i] == candNum){
                ++count;
            }
            else if (--count == 0){
                candNum = nums[i];
                count = 1;
            }
        }
        return candNum;
    }

    public static void main(String[] args) {
        new Solution02().majorityElement(new int[]{1,2,2});
    }
}
