package DSA;

import java.util.List;

public class singleLinkedList {
    //Blue Print
    private ListNode head;
    private  static class ListNode{
        private int data;
        private ListNode next;
        //Constructor
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void displayList(){
        ListNode current = head;
        while (current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }

    //finding length
    public int length(){
        int count=0;
        ListNode current = head;
        while (current!=null){
            count++;
            current=current.next;
        }
        return count;
    }

    //Inserting new Node at beginning
    public void insertBegin(int value){
        ListNode newNode = new ListNode(value);
        newNode.next=head;
        head = newNode;
    }

    //Insert at last
    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        ListNode current = head;
        while (current.next!=null){
            current=current.next;
        }
        current.next= newNode;
    }

    //Insert at position
    public void insertMiddle(int value, int position){
        ListNode newNode = new ListNode(value);
        if (position ==1){
            newNode.next=head;
            head= newNode;
        }
        ListNode previous = head;
        int count=1;
        while(count<position-1){
            previous = previous.next;
            count++;
        }
        ListNode current = previous.next;
        newNode.next = current;
        previous.next = newNode;
    }

    //Delete first Node
    public ListNode deleteFirst(){
        if (head==null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next=null;
        return temp;
    }

    //Delete Last
    public void deleteLast(){
        ListNode current = head;
        ListNode previous = null;
        while (current.next!=null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
    }

    //Deleting at Position
    public void deleteMiddle(int position){
        ListNode previous = head;
        if (position==1){
            head =head.next;
        }
        int count = 1;
        while (count<position-1){
            previous = previous.next;
            count++;
        }
        ListNode current = previous.next;
        previous.next=current.next;
    }

    //Search
    public boolean search(int data){
        ListNode current = head;
        while (current.next!=null){
            current=current.next;
            if (current.data ==data){
                return true;
            }
        }
        return false;
    }

    //Finding Middle Element
    public ListNode findMiddle(){
        ListNode slowPtr = head;
        ListNode fatsPtr = head;
        while (fatsPtr!=null&&fatsPtr.next!=null){
            fatsPtr=fatsPtr.next.next;
            slowPtr=slowPtr.next;
        }
        return slowPtr;
    }

    //Finding nth Node from ending se
    public ListNode findFromEnd(int n){
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count =0;
        while (count<n){
            refPtr = refPtr.next;
            count++;
        }
        while (refPtr!=null){
            mainPtr=mainPtr.next;
            refPtr=refPtr.next;
        }
        return mainPtr;
    }

    //Removing duplicates from sorted List
    public void removeDupli(){
        ListNode current = head;
        while (current!=null && current.next!=null){
            if (current.data == current.next.data){
                current.next=current.next.next;
            }
            else {
                current=current.next;
            }
        }
    }

    //Inserting Node in sorted List
    public void insertNode(int value){
        ListNode newNode = new ListNode(value);
        ListNode temp = null;
        ListNode current = head;
        while (current!=null && current.data<newNode.data){
            temp = current;
            current=current.next;
        }
        temp.next= newNode;
        newNode.next=current;
    }

    //Detecting Loop
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
    //find start of loop
    public void removeLoop(ListNode slowPtr){
        ListNode temp = head;
        while (slowPtr.next!=temp.next){
            slowPtr=slowPtr.next;
            temp=temp.next;
        }
        slowPtr.next=null;
    }



    public static void main(String[] args) {
        singleLinkedList sl1 = new singleLinkedList();
        sl1.head=new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(2);
        ListNode fourth = new ListNode(3);
        ListNode fifth = new ListNode(3);
        ListNode sixth = new ListNode(3);

        sl1.head.next = second;
        second.next=third;
        third.next=fourth;

        singleLinkedList sl2 = new singleLinkedList();
        sl2.head = new ListNode(1);
        ListNode second1 = new ListNode(2);
        ListNode third1 = new ListNode(3);
        ListNode fourth1 = new ListNode(4);
        ListNode fifth1 = new ListNode(5);
        ListNode sixth1 = new ListNode(6);

        sl2.head.next = second1;
        second1.next=third1;
        third1.next=fourth1;
        fourth1.next = fifth1;
        fifth1.next=sixth1;
        sixth1.next=third1;



        //Display
        sl1.displayList();
        //Length
        System.out.println(sl1.length());
        //Insert at start
        sl1.insertBegin(1);
        //Insert last
        sl1.insertLast(3);
        sl1.displayList();
        //InsertMiddle
//        sl1.insertMiddle(5,4);
        sl1.displayList();
        //Delete first
//        System.out.println(sl1.deleteFirst().data);
//        sl1.displayList();
        //Delete Last
//        sl1.deleteLast();
//        sl1.displayList();
        //Deleting Last
//        sl1.deleteMiddle(2);
//        sl1.displayList();
        //Search
//        System.out.println(sl1.search(2));
        //FindMiddle
        System.out.println(sl1.findMiddle().data);
        //Find from end
        System.out.println(sl1.findFromEnd(3).data);
//        sl1.displayList();
        //Remove duplicate from sorted List
        sl1.removeDupli();
//        sl1.displayList();
        sl1.insertNode(4);
//        sl1.displayList();
        //Detect loop
//        System.out.println(sl2.detect());
        //Find start
//        System.out.println(sl2.detect().data);
        //Remove loop
        sl2.findMeetPointOfloop();
        sl2.displayList();








    }
}
