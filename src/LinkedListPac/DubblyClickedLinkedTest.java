package LinkedListPac;

public class DubblyClickedLinkedTest {

    public static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
            this.next= null;
            this.prev=null;
        }
    }

    Node head = null;
    Node tail = null;
    public void addNode(int data){
        Node newnode = new Node(data);
        if(head==null){
            head= tail= newnode;
        }
        else{
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
        }
    }

}
