package LinkedListPac;
public class LinkedListTest {
    int size=0;
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    Node head=null;
    Node tail=null;
    public void addNode(int data){
        size++;
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
//            Node current=head;
//            while(current.next!=null){
//                current=current.next;
//            }
//            current.next=newnode;
        }

    }

    public void printlist(){
        Node current = head;
        while (current!=null){
            System.out.println(current.next);
            current = current.next;
        }
    }

    public int getdataatanypos(int pos){
        Node current = head;
        for(int i=1;i<pos;i++){
            current = current.next;
        }
        return current.data;
    }

    public void removedataatanypos(int pos){
        if(pos>size){
            System.out.println("Index out of bound");
        }
        else if(pos==1){
            Node temp = head;
            head = temp.next;
            temp.next=null;
        }
        else {
            Node current = head;
            for (int i=1;i<pos-1;i++){
                current=current.next;
            }
            if(current.next==tail){
                Node temp=current.next;
                current.next = temp.next;
                tail=current;
            }
            else{
                Node temp=current.next;
                current.next=temp.next;
                temp.next=null;
            }
        }
    }
}


