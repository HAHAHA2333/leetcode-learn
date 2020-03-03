package sample.topic03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Soultion02 {

    /*
     * 题目：翻转二叉树。
     *
     *   输入:
     *        4
     *      /   \
     *     2     7
     *    / \   / \
     *   1   3 6   9
     *
     *   输出:
     *        4
     *      /   \
     *     7     2
     *    / \   / \
     *   9   6 3   1
     *
     * */

    public TreeNode invertTree02(TreeNode root){
        if(root == null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode current = queue.poll();
            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;
            if (current.right != null){
                queue.add(current.right);
            }
            if (current.left != null){
                queue.add(current.left);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        //第一棵树
        TreeNode node01 = new TreeNode(5);
        TreeNode node02 = new TreeNode(15);
        TreeNode node03 = new TreeNode(25);
        TreeNode node04 = new TreeNode(35);
        TreeNode node05 = new TreeNode(45);
        TreeNode node06 = new TreeNode(55);
        //第二棵树
        TreeNode node07 = new TreeNode(65);
        TreeNode node08 = new TreeNode(75);
        TreeNode node09 = new TreeNode(85);

        node01.left = node02;
        node01.right = node03;
        node02.left = node04;
        node02.right = node05;
        node03.left = node06;

        node07.left = node08;
        node07.right = node09;

        new Soultion02().invertTree02(node01);
        System.out.println(node01.value);
        System.out.println(node02.value);
        System.out.println(node03.value);
        System.out.println(node04.value);
        System.out.println(node05.value);
        System.out.println(node06.value);
    }
}
