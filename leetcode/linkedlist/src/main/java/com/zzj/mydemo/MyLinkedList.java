package com.zzj.mydemo;

/**
 * @author zhouzijia
 * @date 2018-8-23 17:22
 */
public class MyLinkedList {
        /**
         * 链表中的头元素
         */
        private Node head;
        /**
         * 链表的元素总个数
         */
        private int index;

        public MyLinkedList() {
        }

        /** Initialize your data structure here. */
        public MyLinkedList(Node node) {
            this.head = node;
        }

        /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
        public int get(int index) {
                if(index >= this.index || (index == 0 && this.head == null) ){
                        return -1;
                }
                Node nextNode = head;
                int count=0;
                while(count<index){
                        nextNode=nextNode.next;
                        count++;
                }
                return nextNode.item;
        }

        /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
        public void addAtHead(int val) {
                Node node = new Node(val);
                if(this.head != null){
                        node.next = head;
                        this.head = node;
                        this.index++;
                }else {
                        this.head = node;
                        this.index = 1;
                }
        }

        /** Append a node of value val to the last element of the linked list. */
        public void addAtTail(int val) {
                Node node = new Node(val);
                Node nextNode = head;
                while(nextNode.next != null){
                        nextNode = nextNode.next;
                }
                nextNode.next = node;
                this.index++;
        }

        /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
        public void addAtIndex(int index, int val) {
                if(index > this.index || index < 0){
                        return;
                }
                if(index == 0){
                        addAtHead(val);
                        return;
                }
                Node node = new Node(val);
                Node tmphead = head;
                Node tmpPrev = new Node();
                int count=0;
                while(count<index){
                        tmpPrev = tmphead;
                        tmphead=tmphead.next;
                        count++;
                }
                if(tmphead == null){
                        tmpPrev.next = node;
                        this.index++;
                }else {
                        Node tmp = tmpPrev.next;
                        tmpPrev.next = node;
                        node.next = tmp;
                        this.index++;
                }
        }

        /** Delete the index-th node in the linked list, if the index is valid. */
        public void deleteAtIndex(int index) {
                if(index > this.index -1 ){
                        return;
                }
                if(index == 0){
                        this.head = null;
                        this.index--;
                        return;
                }
                Node tmp = head;
                int count =0;
                Node tmpprev = new Node();
                while(count<index){
                        tmpprev = tmp;
                        tmp = tmp.next;
                        count++;
                }
                tmpprev.next = tmp.next;
                this.index--;
        }
}

class Node{
        public int item;
        public Node next;

        public Node() {
        }

        public Node(int item) {
                this.item = item;
        }
}

