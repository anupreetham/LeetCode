class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>>hmap= new HashMap<>();

        for(int i=0; i<strs.length; i++){
            String s = strs[i];
            int n= s.length();
            char[] c = new char[n];
            for(int j=0; j<n; j++){
                c[j]=s.charAt(j);
                
            }
            Arrays.sort(c);
            String sort_str = new String(c);
            if(!hmap.containsKey(sort_str)){
                hmap.put(sort_str,new ArrayList<>());
            }
           hmap.get(sort_str).add(s);
           
           
        }
        return new ArrayList<>(hmap.values());
    }
}