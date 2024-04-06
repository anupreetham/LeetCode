class Solution {
    public int firstUniqChar(String s) {
     
HashMap<Character, Integer> h= new HashMap<>();
            for(int i=0; i<s.length(); i++){
                char c=s.charAt(i);
                  h.put(c, h.getOrDefault(c,0)+1);
                }

    for(int i=0; i<s.length(); i++){
     char c=s.charAt(i);
     if(h.get(c)==1)
     return i;
                    }


   return -1; }
}