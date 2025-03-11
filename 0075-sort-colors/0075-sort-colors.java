class Solution {
    public void sortColors(int[] nums) {
    int l=0;
    int r= nums.length-1;
    int i=0;

    while(i<=r){
        if(nums[i]==0){
            int temp=nums[l];
            nums[l]=nums[i];
            nums[i]=temp;
            l++;
        }
        else if(nums[i]==2){
            int temp2= nums[r];
            nums[r]=nums[i];
            nums[i]=temp2;
            r--;
            i--;
        }
        i++;
    }
        
    }
}