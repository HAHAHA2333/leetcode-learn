package sample.threeSum;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {

    /*
    * 三数之和
    * 示例：
    * 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
    * 满足要求的三元组集合为：
    * [
    *   {-1, 0, 1},
    *   {-1, -1, -2}
    * ]
    * 注意：答案中不可以包含重复的三元组
    * */

    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> answer = new LinkedList<>();
        Arrays.sort(nums);
        for (int i = 0;i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            if (left > 0){
                break;
            }
            if (i == 0 || nums[i] == nums[i - 1]){
                while (left < right){
                    if (nums[i] + nums[left] + nums[right] == 0){
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right++;
                        ++left;
                        --right;
                    }
                    else if (nums[i] + nums[left] + nums[right] < 0){
                        ++left;
                    }
                    else {
                        --right;
                    }
                }
            }
        }
        return answer;


    }
}
