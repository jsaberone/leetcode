package com.zzj.mydemo;

/**
 * @author zhouzijia
 * @date 2018-8-23 18:58
 *
 * ["MyLinkedList","addAtHead","addAtHead","deleteAtIndex","addAtIndex","addAtHead","addAtHead","addAtHead","get","addAtTail","addAtIndex","addAtHead"]
[[],[5],[2],[1],[1,9],[4],[9],[8],[3],[1],[3,6],[3]]
 */
public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.addAtHead(5);
        System.out.println(list.get(0));
        list.addAtHead(2);
        System.out.println(list.get(1));
        list.deleteAtIndex(1);
        System.out.println(list.get(1));
        list.addAtIndex(1,9);
        list.addAtHead(4);
        list.addAtHead(9);
        list.addAtHead(8);
        list.get(3);
        list.addAtTail(1);
        list.addAtIndex(3,6);
        list.addAtHead(3);
    }
}
