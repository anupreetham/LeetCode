class Solution {
    public boolean isPalindrome(String s) {
      Deque<Character> stack= new ArrayDeque<>();
      for(int i=0; i<s.length(); i++){
        char c= s.charAt(i);
        if(Character.isLetterOrDigit(c)){
          stack.push(Character.toLowerCase(c));
        }
      }
      for(int j=0; j<s.length(); j++){
        char cr= s.charAt(j);
        if(Character.isLetterOrDigit(cr))
        {
          if(Character.toLowerCase(cr)==stack.peek())
          {
stack.pop();
          }
          else{
            return false;
          }
        }
       
      }
return stack.isEmpty();
        
    }
}