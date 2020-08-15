package sample.topic6;

import java.util.HashMap;
import java.util.Map;

public class Solution01 {

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

    public int singleNumber(int[] nums) {
       Map<Integer,Integer> map = new HashMap<>();
       for (Integer num : nums){
           Integer count = map.get(num);
           count = count == null?1:++count;
           map.put(num,count);
       }

       for (Integer num : nums){
           if (map.get(num) == 1){
               return num;
           }
       }
       return -1;
    }
}
