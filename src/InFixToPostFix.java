public class InFixToPostFix {
    public static int precedence(char c){
        switch(c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static String topostfix(String exp){
        String result="";
        StackTest stack = new StackTest(5);

        for(int i=0; i<exp.length(); i++){
            char c=exp.charAt(i);
            if(precedence(c)>0) {

                while (stack.isempty() == false && precedence(c) < precedence(stack.peek())) {
                    result = result + stack.pop();

                }
                stack.push(c);
            }
            else if(c=='('){
                stack.push(c);
            }
            else if(c==')'){
                char x= stack.pop();
                while(x!='('){
                    result = result+x;
                    x= stack.pop();
                }
            }
            else{
                result= result+c;
            }
        }
        while (!stack.isempty()){
            result=result+stack.pop();
        }

        return result;
    }
    public static void main(String [] args){
        System.out.println(topostfix("a+(b*c)"));
    }
}
