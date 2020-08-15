package core;

import java.util.LinkedList;
import java.util.List;

public class BacktTack {

    /*
    * 递归回溯法 - 全排列
    * 输入：[1,2,3]
    * 输出：
    * [1,2,3],
    * [1,3,2],
    * [2,1,3],
    * [2,3,1],
    * [3,1,2],
    * [3,2,1]
    *
    * */

    List<List<Integer>> ans = new LinkedList<>();
    public List<List<Integer>> permute(int[] nums){
        List<Integer> path = new LinkedList<>();
        backTrack(nums, path);
        return ans;
    }

    private void backTrack(int[] nums, List<Integer> path) {
        if (nums.length == path.size()){
            ans.add(new LinkedList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++){
            if (path.contains(nums[i])){
                continue;
            }
            path.add(nums[i]);
            backTrack(nums, path);
            //path.removeLast();
            path.remove(path.size() - 1);
        }
    }
}
