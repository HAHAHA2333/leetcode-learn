package sample.topic05;

public class Soultion02 {
    /*
     * 题目：反转一个单链表。
     *
     * 示例：
     * 输入: 1->2->3->4->5->NULL
     * 输出: 5->4->3->2->1->NULL
     *
     * */

    public ListNode reverseList02(ListNode root){
        if(root == null || root.next == null){
            return root;
        }
        ListNode current = reverseList02(root.next);
        root.next.next = root;
        root.next = null;
        return current;
    }

}
