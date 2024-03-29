class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map= new HashMap<>();
        for(int i=0; i<magazine.length(); i++){
            if(map.containsKey(magazine.charAt(i)))
            {
map.put(magazine.charAt(i), map.get(magazine.charAt(i))+1);
            }
            else{
                map.put(magazine.charAt(i),1);
            }
            }
            for(int i=0; i<ransomNote.length(); i++){
                char c= ransomNote.charAt(i);
                if(map.containsKey(c) && map.get(c)>0)
                {
map.put(c,map.get(c)-1);
                }
                else return false;
            }
            return true;

    }
}