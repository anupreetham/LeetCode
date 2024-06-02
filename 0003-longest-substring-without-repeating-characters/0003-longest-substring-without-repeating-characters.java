class Solution {
    public int lengthOfLongestSubstring(String s) {
       if(s.length()==0){
            return 0;
        }
         int count=0;
        int ans=1;
        
        for(int i=0; i<s.length()-1;i++){
            StringBuilder sb= new StringBuilder();
            sb.append(s.charAt(i));
            for(int j=i+1; j<s.length();j++){
                 char charToCheck = s.charAt(j);
                if(!sb.toString().contains(Character.toString((charToCheck)))){
                    sb.append(s.charAt(j));
                    count=sb.length();
                    ans=Math.max(ans,count);
                }
                else{
                    count=0;
                    break;
                }
            

            }

        }
        
      return ans;  } 

}