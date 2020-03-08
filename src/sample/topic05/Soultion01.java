package sample.topic05;

public class Soultion01 {
    /*
     * 题目：反转一个单链表。
     *
     * 示例：
     * 输入: 1->2->3->4->5->NULL
     * 输出: 5->4->3->2->1->NULL
     *
     * */

    public ListNode reverseList01(ListNode root){
        ListNode prev = null;
        ListNode curr = root;
        while (curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
