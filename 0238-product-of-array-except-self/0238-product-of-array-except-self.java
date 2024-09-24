class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int l_prod=1;
        int j=1;
        int [] left = new int[n];
        left[0]=1;
    for(int i=1; i<n; i++){
        l_prod= l_prod* nums[i-1];
        left[j]=l_prod;
        j++;
    }
    int [] right = new int[n];
    int r_prod=1;
    right[n-1]=1;
    int r=n-2;
    for(int i=n-2; i>=0; i--){
        r_prod=r_prod*nums[i+1];
        right[r]=r_prod;
        r--;
    }
int [] answer = new int[n];
for(int i=0; i<n; i++){
    answer[i]= left[i]* right[i];
}
return answer;
    }
}