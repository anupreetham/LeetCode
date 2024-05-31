class Solution {
    public int[] searchRange(int[] nums, int target) {
         int [] output={0,0};
        int low=0;
        int high=nums.length-1;
        int find=0;
        if(nums.length==1 && nums[0]==target){
            return output;
        }
        while(low<=high){
            int mid = low + (high-low)/2 ;
            if(nums[mid]==target){
                find=mid;
                while(mid<nums.length && nums[mid]==target ){
                    mid++;
                }
                output[1]=mid-1;
                while(find>=0 && nums[find]==target){
                    find--;
                }
                output[0]=find+1;

               return output;
            }
           
            if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        return new int[]{-1,-1};
        
    }
}