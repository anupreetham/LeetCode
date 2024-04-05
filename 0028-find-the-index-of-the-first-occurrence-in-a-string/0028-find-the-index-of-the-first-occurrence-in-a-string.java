class Solution {
    public int strStr(String haystack, String needle) {
        int index=-1;
        if(haystack.length()<needle.length()) return -1;
        
        for(int i=0; i<=(haystack.length()-needle.length()); i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                index=i;
                for(int j=1; j<needle.length();j++){
                    if(haystack.charAt(i+j)!=needle.charAt(j)){
                        index=-1;
                        break;
                    }  
                }
            if(index!=-1) return index;  
            }    
        }   
        return index; 
 }  
}