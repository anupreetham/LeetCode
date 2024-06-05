class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int result=0;
        int r1=0;
         
        
    for(int i=0; i<houses.length; i++){
        int minVal=Integer.MAX_VALUE;
        for(int j=0; j<heaters.length; j++){
           r1=Math.abs(houses[i]-heaters[j]);
          r1=Math.min(r1,minVal);
           minVal=r1;
        }
        result=Math.max(result,r1);
    }
return result;

    }
}