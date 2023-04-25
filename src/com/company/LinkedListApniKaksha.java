//Here head, next, currNode are imaginary , just working backside
package com.company;


public class LinkedListApniKaksha {
    private int size;
    //contructor
    LinkedListApniKaksha(){
        this.size=0;
    }
    Node head;
    class Node{
        String data;
        Node next;      //does not have any datatype, just imaginary value for pointing next

        //constructor
        Node(String data){
            this.data = data;
            this.next=null;     //initially
            size++;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if (head==null){
            head = newNode;
            return;
        }
        //for not missing the head create currentNode to traverse
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        //when last node points to null then
        currNode.next = newNode;
    }
    public void printList(){
        if (head == null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while (currNode !=null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public void deleteFirst(){
        if (head == null){
            System.out.println("List is Empty");
            return;
        }
        size--;
        head = head.next;
    }
    public void deleteLast(){
        if (head == null){
            System.out.println("List is Empty ");
            return;
        }
        size--;         //here because we will miss the head then
        if (head.next == null){
            head = null;
            return;
        }
        Node secondLast= head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        //when lastNode.next = null
        secondLast.next = null;      //cutting the lastNode
    }
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        LinkedListApniKaksha list = new LinkedListApniKaksha();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("List");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());


    }
}
