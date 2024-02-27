class Solution {
    public boolean isAnagram(String s, String t) {
   
    if(t.length()>s.length()){
      return false;
    }
     HashMap<Character, Integer> hashMap= new HashMap<>();
    for(int i =0; i<s.length(); i++){
      char c = s.charAt(i);
      if(!hashMap.containsKey(c)){
        hashMap.put(c,1);
      }
      else {
       hashMap.put(c,hashMap.get(c)+1);
      }
    }

     for(int i =0; i<t.length(); i++){
        char tc = t.charAt(i);
        if(hashMap.containsKey(tc)){
   hashMap.put(tc,hashMap.get(tc)-1);
        }
     if(hashMap.containsKey(tc) && hashMap.get(tc)==0)
     {
         hashMap.remove(tc);
        
      }

     }
     return hashMap.isEmpty();

    }
}