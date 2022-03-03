public class StackTest {
    int top = -1;
    char[]stk;
    int size;

    public StackTest(int n) {
        stk = new char[n];
        size = n;

    }

    public void push(char data){
        if (isfull()){
            System.out.println("stack overflow");
        }
        else{
//            top++;
            stk[++top]=data;
        }
    }

    boolean isfull()
    {

        return top == size - 1;
    }
    boolean isempty()
    {

        return top == -1;
    }

    char peek()
    {
        return stk[top];
    }

    char pop(){
        if (isempty() ){
            System.out.println("stack underflow");
            return 'f';
        }
        else{
            return stk[top--];
        }
    }
    int peak(){
        return top;
    }

}
