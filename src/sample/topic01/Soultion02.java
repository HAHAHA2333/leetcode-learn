package sample.topic01;

import java.util.Stack;

public class Soultion02 {

    /*
    * 题目：合并二叉树
    * 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
    *
    * 你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，
    * 否则不为 NULL 的节点将直接作为新二叉树的节点。
    *   输入:
	*   Tree 1          Tree 2
    *         1              2
    *        / \            / \
    *       3   2          1   3
    *      /                \   \
    *     5                  4   7
    *   输出:
    *   合并后的树:
    *   	     3
    *   	    / \
    *   	   4   5
    *   	  / \   \
    *   	 5   4   7
    * */

    public TreeNode mergerTrees02(TreeNode t1,TreeNode t2){
       Stack<TreeNode[]> stack = new Stack<>();
       stack.push(new TreeNode[]{t1,t2});
       while (!stack.isEmpty()){
           TreeNode[] treeNodes = stack.pop();
           if (treeNodes[0] == null || treeNodes[1] == null){
               continue;
           }

           treeNodes[0].value += treeNodes[1].value;
           if (treeNodes[0].left == null){
               treeNodes[0].left = treeNodes[1].left;
           }
           else {
               stack.push(new TreeNode[]{t1.left,t2.left});
           }
           if (treeNodes[0].right == null){
               treeNodes[0].right = treeNodes[1].right;
           }
           else {
               stack.push(new TreeNode[]{t1.right,t2.right});
           }
       }
        return t1;
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

        new Soultion02().mergerTrees02(node01,node07);
        System.out.println(node01.value);
        System.out.println(node02.value);
        System.out.println(node03.value);
        System.out.println(node04.value);
        System.out.println(node05.value);
        System.out.println(node06.value);
    }
}
