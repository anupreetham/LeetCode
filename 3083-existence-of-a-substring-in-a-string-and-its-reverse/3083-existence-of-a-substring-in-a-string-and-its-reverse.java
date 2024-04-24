class Solution {
    public boolean isSubstringPresent(String s) {
        for(int i=0; i<=s.length()-2; i++){
           String subStr= s.substring(i, i+2);
           StringBuilder sb= new StringBuilder();
           sb.append(subStr).reverse();
           String sbc= sb.toString();
           if(s.contains(sbc)){
              return true;
           }
         
        }
    return false;
        
    }
}