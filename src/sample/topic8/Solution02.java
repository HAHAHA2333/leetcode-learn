package sample.topic8;

public class Solution02 {

    /*
     * 题目：合并两个有序链表 -- 迭代
     * 将两个升序链表合并为一个新的升序的链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
     *
     * 输入：1->2->4, 1->3->4
     * 输出：1->1->2->3->4->4
     *
     * */

    public ListNode mergeTwoLists(ListNode listNode1,ListNode listNode2){
        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;
        while (listNode1 != null && listNode2 != null){
            if (listNode1.value < listNode2.value){
                prev.next = listNode1;
                listNode1 = listNode1.next;
            }
            else{
                prev.next = listNode2;
                listNode2 = listNode2.next;
            }
            prev = prev.next;
        }
        prev.next = listNode1 == null?listNode2:listNode1;
        return prehead.next;
    }
}
