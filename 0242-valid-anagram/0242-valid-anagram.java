class Solution {
    public boolean isAnagram(String s, String t) {
    HashMap<Character, Integer> shp= new HashMap<>();
    for(int i =0; i<s.length(); i++){
      char c = s.charAt(i);
      if(!shp.containsKey(c)){
        shp.put(c,1);
      }
      else {
       shp.put(c,shp.get(c)+1);
      }
    }
     for(int i =0; i<t.length(); i++){
        char tc = t.charAt(i);
        if(!shp.containsKey(tc)){
          return false;
        }
      if(shp.containsKey(tc)){
         shp.put(tc,shp.get(tc)-1);
      }
      if(shp.containsKey(tc) && shp.get(tc)==0){
        shp.remove(tc);
      }

     }
     return shp.isEmpty();

    }
}