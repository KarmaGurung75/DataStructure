public class CheckParentThesis {
    public boolean checkBalanced(String exp){
        StackTest stk = new StackTest(5);
        String openingbraces="[{(";
        String closingbraces="]})";

        for(int i=0; i<exp.length();i++){
            char bracket = exp.charAt(i);

            if(bracket=='[' || bracket=='{' || bracket=='('){
                stk.push(bracket);
            }

            else{
                int closingbracketindex= closingbraces.indexOf(bracket);
                char crosspondingopenbracket=openingbraces.charAt(closingbracketindex);
                char popedbracket= stk.pop();
                if(crosspondingopenbracket!=popedbracket){
                    return false;
                }
            }

        }
        if(stk.isempty()){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args){
        CheckParentThesis chk=new CheckParentThesis();
        System.out.println(chk.checkBalanced("[{)"));
    }
}
