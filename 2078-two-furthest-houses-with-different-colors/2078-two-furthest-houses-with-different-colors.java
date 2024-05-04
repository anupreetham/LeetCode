class Solution {
    public int maxDistance(int[] colors) {
        int count=0;
        for(int i=0; i<colors.length; i++){
            int j=i+1;
            while(j<colors.length){
                if(colors[i]==colors[j]){
                      j++;
                    }
            else{
                count=Math.max(count, (j-i));
                j++;
            }
        }
        }
        return count;

        
    }
}