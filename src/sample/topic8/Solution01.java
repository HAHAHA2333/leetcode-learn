package sample.topic8;

import java.util.HashMap;
import java.util.Map;

public class Solution01 {

    /*
    * 题目：合并两个有序链表 -- 递归
    * 将两个升序链表合并为一个新的升序的链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
     *
    * 输入：1->2->4, 1->3->4
    * 输出：1->1->2->3->4->4
    *
    * */

    public ListNode mergeTwoLists(ListNode listNode1,ListNode listNode2){
        if (listNode1 == null){
            return listNode2;
        }
        if (listNode2 == null){
            return listNode1;
        }
        if (listNode1.value < listNode2.value){
            listNode1.next = mergeTwoLists(listNode1.next,listNode2);
            return listNode1;
        }
        else{
            listNode2.next = mergeTwoLists(listNode1,listNode2.next);
            return listNode2;
        }
    }
}
