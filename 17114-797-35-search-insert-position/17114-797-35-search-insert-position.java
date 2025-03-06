class Solution {
    public int searchInsert(int[] nums, int target) {
        int n= nums.length-1;
        int res=0;
        int l=0, h=n;

        while(l<=h){
         int m= (l+h)/2;
        if(target > nums[m]){
            l=m+1;
        }
        if(target < nums[m]){
            h=m-1;
        }
        if(target == nums[m])
        {
            res= m;
             break;
        }
     }
           if(res==0){
            res=l;
           }
       
        return res;
        
    }
}