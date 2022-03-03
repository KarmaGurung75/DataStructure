package Queue;

public class QueueTest {
    int front;
    int rear;
    int [] queue;
    int size;

    QueueTest(int n){
        //this.front=-1;
        this.front=this.rear=-1;
        this.size=n;
        queue= new int[n];
    }

    public void enqueue(int data){
        if(isfull()){
            System.out.println("queue overflow");
        }
        else{
            if(ismpty()){
                front=0;
            }
            queue[++rear]=data;
        }
    }

    public int dequeue(){
        if(ismpty()){
            System.out.println("queue underflow");
            return -9999;
        }
        else{
            int temp=front;
            if(front==rear){
                front=rear=-1;
            }
            else{
                front++;
            }
            return queue[temp];
        }
    }



    public boolean ismpty(){
        return front==-1 && rear==-1;
    }

    public boolean isfull(){
        return rear==size-1;
    }

    public int peek(){
        return queue[front];

    }

}
