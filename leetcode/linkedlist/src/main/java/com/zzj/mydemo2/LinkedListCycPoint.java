package com.zzj.mydemo2;

/**
 * @author zhouzijia
 * @date 2018-8-24 17:06
 * 判断两个单链表是否相交
 */
public class LinkedListCycPoint {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA != null && headB != null) {
            ListNode anode2 = headA;
            ListNode bnode2 = headB;
            while(anode2.next != null){
                anode2 = anode2.next;
                if(anode2 == headB){
                    return anode2;
                }
            }
            while(bnode2.next != null){
                bnode2 = bnode2.next;
                if(bnode2 == headA){
                    return bnode2;
                }
            }

            ListNode anode = headA;
            ListNode bnode = headB;
            if(anode == bnode){
                return anode;
            }
            while (anode.next != null) {
                anode = anode.next;
                while (bnode.next != null) {
                    bnode = bnode.next;
                    if (anode == bnode) {
                        return anode;
                    }
                }
                if(anode == bnode) {
                    return anode;
                }
            }
            ListNode anode1 = headA;
            ListNode bnode1 = headB;
            while (bnode1.next != null) {
                bnode1 = bnode1.next;
                while (anode1.next != null) {
                    anode1 = anode1.next;
                    if (anode1 == bnode1) {
                        return bnode1;
                    }
                }
                if(anode1 == bnode1) {
                    return anode1;
                }
            }


        }
        return null;
    }
}
