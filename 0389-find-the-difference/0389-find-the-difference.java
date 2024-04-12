class Solution {
    public char findTheDifference(String s, String t) {
        char ret=' ';
      HashMap<Character, Integer> hmap= new HashMap<>();
      for(int i=0; i<s.length(); i++){
        char c1= s.charAt(i);
        if(!hmap.containsKey(c1)) hmap.put(c1,1);
        else hmap.put(c1,(hmap.get(c1)+1));
      }
      for(int j=0; j<t.length(); j++){
        char c2= t.charAt(j);
        if(hmap.containsKey(c2)) hmap.put(c2,(hmap.get(c2)-1));
         if(!(hmap.containsKey(c2)) || (hmap.get(c2)<0)) {
            ret=c2;
            break;
         }
      }
      return ret;
    }
}