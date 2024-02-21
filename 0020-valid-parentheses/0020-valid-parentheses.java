class Solution {
    public boolean isValid(String s) {
        Stack<Character>stk=new Stack<Character>();
   for(int i=0; i<s.length(); i++){
       char ch= s.charAt(i);

       if(ch=='('){
           stk.push(')');
       }
       else if(ch=='{') {
           stk.push('}');
       }
       else if(ch=='[') {
           stk.push(']');
       }
       else if(stk.isEmpty() || stk.pop()!=ch) {
           return false;
       }
  
  
   }
        return stk.isEmpty();
    }
}