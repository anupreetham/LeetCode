class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1= new StringBuilder();
         StringBuilder str2= new StringBuilder();
        for(int i=0; i<word1.length;i++){
            str1= str1.append(word1[i]);
        }
        for(int j=0; j<word2.length;j++){
            str2= str2.append(word2[j]);
        }
    
        return str1.toString().equals(str2.toString());
        
    }
}