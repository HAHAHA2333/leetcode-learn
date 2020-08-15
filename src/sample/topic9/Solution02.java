package sample.topic9;

import sample.topic8.ListNode;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Solution02 {

    /*
     * 题目：把二叉搜索树转换为累加树 -- 迭代
     * 给定一个二叉搜索树（Binary Search Tree），把它转换成为累加树（Greater Tree)，使得每个节点的值是原来的节点值加上所有大于它的节点值之和。
     *
     * 原理：
     * 二叉树指大于父节点的值为右结点，小于父节点的值为左节点
     * 正向中序遍历为一个递增的有序序列
     * 采用反向中序遍历，得到最终的累加树
     *
     * 输入：原始二叉搜索树:
     *         5
     *       /   \
     *      2     13
     *
     * 输出：转换为累加树:
     *         18
     *       /   \
     *     20     13
     * */


    public TreeNode convertBST(TreeNode root) {
        int sum = 0;
        TreeNode node = root;
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.add(node);
                node = node.right;
            }
            node = stack.pop();
            sum += node.value;
            root.value = sum;
            node = node.left;
        }
        return root;
    }
}
