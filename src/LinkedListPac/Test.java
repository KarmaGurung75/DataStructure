package LinkedListPac;

public class Test {
        public static void main(String [] args){
            LinkedListTest list=new LinkedListTest();
            list.addNode(10);
            list.addNode(20);
            list.addNode(30);
            System.out.println("getting");
            System.out.println(list.getdataatanypos(2));
            System.out.println("remove");
        }
}
