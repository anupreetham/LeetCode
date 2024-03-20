class Solution {
  public boolean backspaceCompare(String s, String t) {
    Stack<Character> s1 = new Stack<>();
    Stack<Character> s2 = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      char cha = s.charAt(i);
      if (cha == '#'){
     if(!s1.isEmpty())
       {
        s1.pop();
      }
      }
   else  s1.push(cha);
   }

    for (int i = 0; i < t.length(); i++) {
      char cha1 = t.charAt(i);
      if (cha1 == '#')
      {
 if(!s2.isEmpty()) 
      {
        s2.pop();
      }
      }
     else s2.push(cha1);
    }

    if(s1.equals(s2)){
        return true;
    }

    
    return false;
  }
}
