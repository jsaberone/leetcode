package com.zzj.mydemo2;

/**
 * @author zhouzijia
 * @date 2018-8-24 15:44
 */
public class LinedListCyc {
    public boolean hasCycle(ListNode head) {
        //快慢指针
        ListNode slow,fast;
        slow=fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}

class ListNode{
    int val;
    ListNode next;

    ListNode(int x) {
          val = x;
          next = null;
    }
}