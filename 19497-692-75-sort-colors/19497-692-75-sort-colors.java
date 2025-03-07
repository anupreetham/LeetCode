class Solution {
    public void sortColors(int[] nums) {
        int n= nums.length;
        for (int i=0; i<n-1 ; i++){
            int minInd=i;
            
            for(int j=i+1; j<n; j++){
                if(nums[minInd]>nums[j]){
                    minInd=j;
                }

            }
            int temp= nums[i];
            nums[i]=nums[minInd];
            nums[minInd]=temp;


            
        }
        
    }
}