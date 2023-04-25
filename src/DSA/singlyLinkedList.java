package DSA;

import java.util.List;

public class singlyLinkedList {
   private ListNode head;   //**IMP  Instance variable created..for holding the linkedList
   private static class ListNode{   //class must have only the blue print i.e only the variable initializations and all
       private int data;
       private ListNode next;       //ListNode variable with name next  **IMP

       //Constructor...will take the data part
       public ListNode(int data){
           this.data=data;
           this.next=null;      //by default new data will point to null (Instance variable created)
       }
   }

       public void displayList(){
           ListNode current = head;     //putting head in current..beacuse original head must not change
           while (current!=null){
               System.out.print(current.data+" --> ");
               current=current.next;
           }
           System.out.println("null");
       }

       //Finding lenght of List
    public int lenghtOfList(){
       if (head == null){
           return 0;
       }
       ListNode current = head;
       int count = 0;
       while (current!=null){
           count++;
           current = current.next;
       }
       return count;
    }

    //Inserting New Node at beginning
    public void insertNewNodeAtStart(int value){
       ListNode newNode = new ListNode(value); //constructor calling with int data = value
        newNode.next = head;
        head = newNode;
    }

    //Insert new Node at Last
    public void insertNewNodeAtLast(int value) {
       ListNode newNode = new ListNode(value);  //calling constructor
       if (head == null){
           head = newNode;
           return ;
       }
       ListNode current = head;
       while (current.next!=null){
           current = current.next;  //traversing till the last node where its pointer point to null, i.e it does not have any next value
       }
       current.next = newNode;
    }

    //Inserting Node in middle of the List
    public void insertInMiddle(int value, int position){
       ListNode node = new ListNode(value);
       if (position==1){
           node.next=head;
           head = node;
       }
       else {
           ListNode previous = head;    //head should be safe
           int count = 1;
           while (count<position-1){
               previous = previous.next;
               count++;
           }
           //here it reaches at the desired position
           //for this keep the diagram int book in mind
           ListNode current = previous.next;        //holding value of previous next to not loose the list
           node.next = current;
           previous.next = node;
       }
    }

    //Dleting first Node
    public ListNode deleteFirst(){
       if (head==null){
           return null;
       }
       ListNode temp = head;
       head = head.next;
       temp.next =null;         //to break the Linkage
        return temp;
    }

    //Deleting last Node
    public ListNode deleteLast(){
       if (head==null || head.next == null){
           return head;
       }
       ListNode current = head;
       ListNode previous = null;
       while (current.next != null){
           previous = current;      //previous will be just behind current
           current = current.next;
       }
       previous.next=null;
       return current;
    }

    //Deleting from given position
    public  void deleteMiddle(int position){
       if (position==1){
           head = head.next;
       }
       else {
           ListNode previous = head;
           int count=1;
           while (count<position-1){
               previous=previous.next;
               count++;
           }
           ListNode current = previous.next;
           previous.next = current.next;    //link breaking
       }
    }

    //Searching Element
    public boolean searchDataPoint(int Searchkey){
       if (head == null){
           return false;
       }
       ListNode current = head;
       while (current!=null){
           if (Searchkey == current.data){
               return true;
           }
           else {
               current = current.next;
           }
       }
       return false;
    }

    //Reversing List
    public void reverse(){
       if (head == null || head.next ==null){
           return ;
       }
       ListNode current = head;
       ListNode next = null;
       ListNode previous = null;
       while (current!=null){
           next = current.next;
           current.next = previous;
           previous = current;  //updating previous
           current = next;      //updating current
       }
       head.next = null;    //old head point to null
       head = previous; //nre head will the last node i.t previous
    }

    //Finding middle element
    public ListNode middle(){
       if (head==null){
           return null;
       }
       ListNode slowPtr = head; //moves one step ahead
       ListNode fastPtr = head; //moves 2 steps
        while (fastPtr!=null && fastPtr.next!=null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    //Find nth node from end of List
    public ListNode findNodeFromEnd(int n){     //n->position from end
       if (head==null){
           return null;
       }
       ListNode mainPtr = head;
       ListNode refPtr = head;
       int count = 0;
       while (count<n){
           refPtr = refPtr.next;
           count++;
       }
       while (refPtr!=null){
           refPtr = refPtr.next;
           mainPtr = mainPtr.next;
       }
       return mainPtr;
    }

    //Removing duplicates from sorted List
    public void removeDuplicate(){
       if (head==null){
           return;
       }
       ListNode current = head;
       while (current!=null && current.next!=null){
           if (current.data == current.next.data){
               current.next = current.next.next;
           }
           else {
               current = current.next;
           }
       }
    }

    //Insert New Node in Sorted List
    public ListNode insertInSortedList(int value){
       ListNode newNode = new ListNode(value);
       if (head ==null){
           return newNode;
       }
       ListNode current = head;
       ListNode temp = null;
       while (current!=null && current.data<newNode.data){
           temp = current;
           current=current.next;
       }
       newNode.next=current;
       temp.next = newNode;
       return head;
    }

    //Detecting Loop in List
    public boolean detectLoop(){
       if (head ==null){
           return false;
       }
       ListNode slowPtr = head;
       ListNode fastPtr = head;
       while (fastPtr!=null && fastPtr.next!=null){
           fastPtr=fastPtr.next.next;
           slowPtr = slowPtr.next;
           if (slowPtr == fastPtr){
               return true;
           }
       }
       return false;
    }
    public void loopedLinkedList(){
       ListNode first = new ListNode(1);
       ListNode second = new ListNode(2);
       ListNode third = new ListNode(3);
       ListNode fourth = new ListNode(4);
       ListNode fifth = new ListNode(5);
       ListNode sixth = new ListNode(6);

       head = first;
       first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=third;       //see in notebook
    }

    //Finding starting Node ofthe loop..where the loop starts
    public ListNode findStart(){
       ListNode fastPtr = head;
       ListNode slowPtr = head;
       while (fastPtr!= null && fastPtr.next!=null){
           fastPtr = fastPtr.next.next;
           slowPtr = slowPtr.next;
           if (slowPtr==fastPtr){
               return getStartNode(slowPtr);
           }
       }
       return null;
    }
    public ListNode getStartNode(ListNode slowPtr){
       ListNode temp = head;
       while (temp!=slowPtr){
           temp=temp.next;
           slowPtr=slowPtr.next;
       }
       return temp;
    }

    //Removing the loop
    public void findMeetPointOfloop(){
       ListNode slowPtr = head ;
       ListNode fastPtr = head;
       while (fastPtr!=null && fastPtr.next!=null){
           fastPtr=fastPtr.next.next;
           slowPtr=slowPtr.next;
           if (fastPtr==slowPtr){
               removeLoop(slowPtr);
               return;
           }
       }
    }
    public void removeLoop(ListNode slowPtr){
       ListNode temp = head;
       while (temp.next != slowPtr.next){
           temp=temp.next;
           slowPtr=slowPtr.next;
       }
       slowPtr.next=null;
    }

    //Merge two sorted linked List
    public static ListNode merge(ListNode a, ListNode b){
       ListNode dummy = new ListNode(0);
       ListNode tail = dummy;
       while(a!=null && b!=null){
           if (a.data <= b.data){
               tail.next = a;
               a=a.next;
           }
           else {
               tail.next=b;
               b=b.next;
           }
           tail = tail.next;
       }
       if (a==null){
           tail.next = b;
       }
       else if (b==null){
           tail.next = a;
       }
       return dummy.next;
    }

    //adding reversed linked List
    public static ListNode add(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;
        while(a!=null || b!=null){
            int x = (a!=null) ? a.data:0;
            int y = (b!=null) ? b.data:0;
            int sum = carry+x+y;
            carry = sum/10;
            tail.next = new ListNode(sum%10);
            tail=tail.next;
            if (a!=null)
                a=a.next;
            if (b!=null)
                b=b.next;
        }
        if (carry>0){
            tail.next = new ListNode(carry);
        }
        return dummy.next;
    }




    public static void main(String[] args) {
        singlyLinkedList sl1 = new singlyLinkedList();
        sl1.head = new ListNode(10);
        ListNode second = new ListNode(1);  //constructor called
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        //now connecting them together to form a singly linked list
        sl1.head.next = second;     //10-->1
        second.next=third;          //10-->1-->8
        third.next = fourth;        //10-->1-->8-->11

        //printing the list
        sl1.displayList();
        //Finding length of list
        System.out.println("Length of SinglyLinkedList is : "+sl1.lenghtOfList());

        //Insertinng New node at start
        System.out.println("Insert at beginning");
        sl1.insertNewNodeAtStart(77);
        sl1.insertNewNodeAtStart(22);
        sl1.displayList();


        //inserting new node at last
        System.out.println("insert at last");
        sl1.insertNewNodeAtLast(99);
        sl1.insertNewNodeAtLast(100);
        sl1.displayList();

        //inserting new node in middle
        System.out.println("Insert in middle");
        sl1.insertInMiddle(2,5);
        sl1.insertInMiddle(45,1);
        sl1.insertInMiddle(3,6);
        sl1.insertInMiddle(46,1);   //will insert before 45
        sl1.insertInMiddle(45,3);
        sl1.insertInMiddle(22,5);
        sl1.displayList();

        //Delete first node
//        System.out.println("Deleting first node");
//        sl1.deleteFirst();
//        sl1.displayList();

        //Delete last node
//        System.out.println("Deleting Last Node i.e "+sl1.deleteLast().data);
//        sl1.displayList();

        //Delete in middle
//        System.out.println("deleted at position 3");
//        sl1.deleteMiddle(3);
//        sl1.displayList();

        //Searching Element
//        System.out.println("Searching Data Point");
//        if (sl1.searchDataPoint(0)){
//            System.out.println("yes data is present in linked List");
//        }
//        else {
//            System.out.println("Data not Present");
//        }

        //Reversing List
//        sl1.reverse();
//        sl1.displayList();

        //Middle element of List
        System.out.println("Middle element of List is : "+sl1.middle().data);

        //Finding Node from end of List
        System.out.println("Node on nth position from end");
        System.out.println(sl1.findNodeFromEnd(2).data);

        //Removing duplicates from sorted List
        System.out.println("duplicates removed");
        sl1.removeDuplicate();
        sl1.displayList();

        //Insert New Node in Sorted List....works only in sorted List
//        sl1.insertInSortedList(23);
//        sl1.displayList();

        //Detecting Loop in SinglyLinkedList
        singlyLinkedList sl2 = new singlyLinkedList();
        sl2.loopedLinkedList();
        System.out.println("Looped Singly Linked list");
        if (sl2.detectLoop()){
            System.out.println("Yes there is a Loop");
        }
        else {
            System.out.println("No Loop present");
        }
        //Finding Start of the Loop
        System.out.println("The loop has been started at data Point");
        System.out.println(sl2.findStart().data);
        //Removing the loop
        System.out.println("Removing the loop");
        sl2.findMeetPointOfloop();
        sl2.displayList();

        //Merging sorted Linked List
        System.out.println("Merging sorted List");
        singlyLinkedList sl3 = new singlyLinkedList();
        sl3.insertNewNodeAtLast(1);
        sl3.insertNewNodeAtLast(4);
        sl3.insertNewNodeAtLast(8);

        singlyLinkedList sl4 = new singlyLinkedList();
        sl4.insertNewNodeAtLast(3);
        sl4.insertNewNodeAtLast(5);
        sl4.insertNewNodeAtLast(8);
        sl4.insertNewNodeAtLast(9);

        sl3.displayList();
        sl4.displayList();
        //here we are creating static method therefore we can access it directly without object
        //see below....also create a new result to store
        singlyLinkedList result = new singlyLinkedList();
        result.head = merge(sl3.head,sl4.head);
        System.out.println("Merged");
        result.displayList();

        //Adding Reverse Linked List
        singlyLinkedList sl5 = new singlyLinkedList();
        sl5.insertNewNodeAtLast(7);
        sl5.insertNewNodeAtLast(4);
        sl5.insertNewNodeAtLast(9);
        singlyLinkedList sl6 = new singlyLinkedList();
        sl6.insertNewNodeAtLast(5);
        sl6.insertNewNodeAtLast(6);

        singlyLinkedList result1 = new singlyLinkedList();
        result1.head = add(sl5.head,sl6.head);
        System.out.println("addition of reverse linked List");
        result1.displayList();














    }



}
