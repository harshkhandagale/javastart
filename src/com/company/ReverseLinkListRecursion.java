package com.company;

public class ReverseLinkListRecursion {
    static Node head;
    static class Node{
        int data; Node next;
        //Constructor
        Node(int d){
            data = d;
            next = null;
        }
    }
    Node recursion(Node head){
        if (head==null || head.next==null){
            return head;
        }
        Node newHead = recursion(head.next);        //recursive call that will return last node
        //here we get head as 7
        Node headNext = head.next;      //i.e 4
        headNext.next = head;
        head.next = null;
        return newHead;
    }
    //print
    void printList(Node head){
        while (head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        ReverseLinkListRecursion l1 = new ReverseLinkListRecursion();
        l1.head = new Node(10);
        l1.head.next = new Node(5);
        l1.head.next.next = new Node(7);
        l1.head.next.next.next = new Node(4);
        System.out.println("Original List");
        l1.printList(head);
        System.out.println();
        System.out.println("reversed by recursion");
        head = l1.recursion(head);
        l1.printList(head);


    }
}
