package Caching;

import java.util.HashMap;

public class LRUCaching {

    int capacity;

    HashMap<Integer,Node> map;
    LRUCaching(int capacity){
        this.capacity=capacity;
        map=new HashMap<>();
    }

    public static class Node{
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value){
            this.key=key;
            this.value=value;
            this.prev=null;
            this.next=null;
        }
    }

    public int get(int key){
        Node node=map.get(key);

        if(node==null){
            return -1;
        }
        else{
            // remove node
            remove(node);
            insert(node);

            // insert node
            return node.value;
        }
        // return node.value;
    }

    public void put(int key, int value){

        if(map.containsKey(key)){
            // remove element
            remove(map.get(key));
            //insert
        }
        else if(map.size()==capacity){
            //remove node from tail
            remove(tail);
        }
        Node newnode=new Node(key,value);
        insert(newnode);
    }
    Node head=null;
    Node tail=null;
    public void insert(Node newnode){
        map.put(newnode.key, newnode);
        if(head==null){
            head=tail=newnode;
        }
        else{
            head.prev=newnode;
            newnode.next=head;
            head=newnode;
        }
    }
    public void remove(Node node){
        map.remove(node.key);
        if(node==tail){
            tail=tail.prev;
            tail.next.prev=null;
            tail.next.next=null;
            tail.next=null;
        }
        else if(node==head){
            head=head.next;
            head.prev.next=null;
            head.prev=null;
        }

        else if(node==head && head==tail){
            head=tail=null;
        }

        else{
            node.prev.next=node.next;
            node.next.prev=node.prev;
            node.next=null;
            node.prev=null;
        }
    }
}
