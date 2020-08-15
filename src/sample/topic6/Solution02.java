package sample.topic6;

import java.util.HashMap;
import java.util.Map;

public class Solution02 {

    /*
     * 题目：找出只出现一次的数字
     * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     *
     * 输入： [2,2,1]
     * 输出：1
     *
     * 输入：[4,1,2,1,2]
     * 输出：4
     * */

    /*
    * 使用异或运算 (^)⊕ 解决, 结论如下：
    * （1）a ⊕ 0 = a
    * （2）a ⊕ a = 0
    * （3）a ⊕ b ⊕ a = b ⊕ a ⊕ a = b ⊕ (a ⊕ a) = b ⊕ 0 = b
    * */

    private int singleNumber(int[] nums) {
        int ant = nums[0];
        if (nums.length > 1){
            for (int i = 1; i < nums.length; ++i){
                ant ^= nums[i];
            }
        }
        return ant;
    }

    public static void main(String[] args) {
        new Solution02().singleNumber(new int[]{1,2,2});
    }
}
