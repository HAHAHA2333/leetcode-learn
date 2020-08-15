package sample.topic7;

import java.util.HashMap;
import java.util.Map;

public class Solution01 {

    /*
    * 题目：多数元素
    * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
    * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
    *
    * 输入：[3,2,3]
    * 输出：3
    *
    * 输入：[2,2,1,1,1,2,2]
    * 输出：2
    * */

    private Map<Integer,Integer> countsMapName(int[] nums){

//        for (Integer num : nums){
//            countsMap.merge(num, 1, Integer::sum);
//        }
        Map<Integer,Integer> countMap = new HashMap<>();
        for (Integer num : nums){
            if (null == countMap.get(num) ){
                countMap.put(num,1);
            }
            else{
                countMap.put(num,countMap.get(num) + 1);
            }
        }
        return countMap;
    }

    private int majorityElement(int[] nums){
        Map<Integer,Integer> map = countsMapName(nums);
        Map.Entry<Integer,Integer> majorEntry = null;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (majorEntry == null || entry.getValue() > majorEntry.getValue()){
                majorEntry = entry;
            }
        }
        return majorEntry.getKey();
    }
}
