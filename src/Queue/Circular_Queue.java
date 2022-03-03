package Queue;

public class Circular_Queue {
    int front;
    int rear;
    int size;
    int [] queue;

    // Constructor
    Circular_Queue(int n){
        front = rear =-1;
        size=n;
        queue =new int[n];

    }

    public void enqueue(int data){
        if(isfull()){
            System.out.println("queue overflow");
        }
        else{
            if(isempty()){
                front=rear=0;
                queue[rear]=data;
            }
            else{
                rear=(rear+1)%size;
                queue[rear]=data;
            }
        }
    }

    public int dequeue(){
        int temp=front;
        if(isempty()){
            System.out.println("queue ounderflow");
            return -9999;
        }
        else if(front==rear){
            front=rear=-1;
        }
        else{
            front=(front+1)%size;
        }
        return queue[temp];
    }


    public boolean isempty(){
        return front==-1 && rear==-1;
    }

    public boolean isfull(){
        return (rear+1)%size == front;
    }

    public static void main(String [] args){

    }
}
