class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)==ch){
                sb.append(word.charAt(i));
                sb.reverse();
                sb.append(word.substring(i+1,word.length()));
                break;

            }
            else{
                sb.append(word.charAt(i));
            }
        }
        return sb.toString();
        
    }
}