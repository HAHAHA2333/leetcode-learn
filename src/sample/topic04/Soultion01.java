package sample.topic04;

public class Soultion01 {

    /*
    * 题目：二叉树的最大深度
    * 给定一个二叉树，找出其最大深度。
    *
    * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
    *
    * 示例:
    * 给定二叉树 [3,9,20,null,null,15,7]
    *
	*       3
    *      / \
    *     9  20
    *       /  \
    *      15   7
    *
    * 返回它的最大深度 3
    *
     * */

    public int maxDepth01(TreeNode root){
        if (root == null){
            return 0;
        }
        else {
            int left = maxDepth01(root.left);
            int right = maxDepth01(root.right);
            return java.lang.Math.max(left,right) + 1;
        }
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

        System.out.println("该树最大的深度为：" + new Soultion01().maxDepth01(node01));
    }
}
