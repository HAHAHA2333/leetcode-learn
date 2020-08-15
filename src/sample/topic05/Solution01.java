package sample.topic05;

import sun.plugin2.main.server.JVMHealthData;

import java.util.List;

public class Solution01 {
    /*
     * 题目：反转一个单链表。
     *
     * 示例：
     * 输入: 1->2->3->4->5->NULL
     * 输出: 5->4->3->2->1->NULL
     *
     * */

    public ListNode reverseList01(ListNode head){
        if (head == null){
            return null;
        }
        else {
            ListNode prev = null;
            ListNode curr = head;
            ListNode temp = null;
            while (curr != null){
                temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            return prev;
        }
    }
}
