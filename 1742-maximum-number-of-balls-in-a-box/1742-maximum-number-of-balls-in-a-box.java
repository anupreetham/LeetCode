class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> hmap= new HashMap<>();
         int maxValue = Integer.MIN_VALUE;
       
        for(int i= lowLimit; i<=highLimit; i++){
            int sum=0;
            int num=i;
            while(num>0){
                int digit=num%10;
                sum=sum+digit;
                num=num/10;
            }
            hmap.put(sum,(hmap.getOrDefault(sum,0))+1);
            int val = hmap.get(sum);
            if(val>maxValue){
                maxValue= val;
            }
        }
        return maxValue;
    }
}