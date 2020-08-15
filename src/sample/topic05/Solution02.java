package sample.topic05;

import sample.topic04.TreeNode;

public class Solution02 {
    /*
     * 题目：反转一个单链表。
     *
     * 示例：
     * 输入: 1->2->3->4->5->NULL
     * 输出: 5->4->3->2->1->NULL
     *
     * */

    private ListNode reverseList02(ListNode head){
       if (head == null || head.next == null){
           return head;
       }
       else {
           ListNode currentNode = reverseList02(head.next);
           head.next.next = head;
           head.next = null;
           return currentNode;
       }
    }

}
