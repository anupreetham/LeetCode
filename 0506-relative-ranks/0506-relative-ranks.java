class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer, String> hmap= new HashMap<>();
       int[] savedArr=  Arrays.copyOf(score, score.length);
        Arrays.sort(score);
        for(int i=score.length-1; i>=0; i--){
            if(i==score.length-1) hmap.put(score[i],"Gold Medal");
            else if(i==score.length-2) hmap.put(score[i],"Silver Medal");
            else if(i==score.length-3) hmap.put(score[i],"Bronze Medal");
            else{
                int x= score.length-i;
                hmap.put(score[i],Integer.toString(x));
            }
        }
         String[] values = new String[score.length];
    for (int j=0; j<savedArr.length; j++){
        values[j]=hmap.get(savedArr[j]);

    }
        return values;
    }
}