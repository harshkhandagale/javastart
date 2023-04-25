package com.company;// Java program for reversing the linked list

class ReverseLinkedList1Iteration {

    static Node head;

    static class Node {
        int data; Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    /* Function to reverse the linked list */
    Node reverse(Node head)
    {
        Node prev = null;
        Node current = head;
        Node temp = null;
        while (current != null) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }

    // prints content of double linked list
    void printList(Node head)
    {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        ReverseLinkedList1Iteration list = new ReverseLinkedList1Iteration();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
}

// This code has been contributed by Mayank Jaiswal
