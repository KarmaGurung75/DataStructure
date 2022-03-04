package Queue;

import java.util.Queue;

public class Test {
    public static void main(String [] args){
        QueueTest q=new QueueTest(5);
//        q.enqueue(10);
//        q.enqueue(20);
//        q.enqueue(30);
//        System.out.println(q.dequeue());
//        System.out.println(q.dequeue());
//        System.out.println(q.dequeue());


        // deQueue is not possible on empty queue
        q.dequeue();

        // enQueue 5 elements
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        // 6th element can't be added to because the queue is full
        q.enqueue(6);

//        q.display();
        System.out.println(q.dequeue());

        // deQueue removes element entered first i.e. 1
        q.dequeue();
        System.out.println(q.dequeue());
        // Now we have just 4 elements
//        q.display();

    }
}

