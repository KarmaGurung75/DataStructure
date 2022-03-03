package Queue;

public class Test {
    public static void main(String [] args){
        QueueTest q=new QueueTest(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
