class Solution {
    public boolean isSubsequence(String s, String t) {
        if(t.length()<s.length()) return false;
    int j=0;
    int flag=0;

    for(int i=0; i<s.length();i++){
        while(j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                flag++;
                j++;
                break;
            }
            j++;
        }
      
        }
          if(flag==s.length()) {
            return true;
         }
        
    return false;
    }
}