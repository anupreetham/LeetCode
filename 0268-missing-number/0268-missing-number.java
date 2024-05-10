class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        int res=0;
        for(int i =0; i<l; i++){
           if(res==nums[i]){
            res++;
           }
           else{
            res=i;
            break;
           }
        }
       return res; 
    }
}