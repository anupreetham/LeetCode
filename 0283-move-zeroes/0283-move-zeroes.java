class Solution {
    public void moveZeroes(int[] nums) {
      
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                int k=i;
                for(int j=k+1; j<nums.length; j++){
                    if(nums[j]!=0){
                        nums[k]=nums[j];
                        nums[j]=0;
                        k=j;
                    }
                 }
            }
         }      
    }
}