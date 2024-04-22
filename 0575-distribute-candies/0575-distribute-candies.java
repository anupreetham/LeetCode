class Solution {
    public int distributeCandies(int[] candyType) {
        int eat= candyType.length/2;
       Set<Integer> type = new HashSet<>();
        for (int i : candyType) {
            type.add(i);
        }
        int unique=type.size();
        int result;
        if(unique==eat || unique<eat)  result=unique;
        else result= eat; 
        
        return result;
        

        
    }
}