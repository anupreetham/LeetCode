//Bottomup dynamic programming 
class Solution {
    public int climbStairs(int n) {
      int[] dp= new int[n+1]; //since we are starting from step 0 and getting on nth step it is [n+1] array
        
      dp[0]=dp[1]=1;

      for(int i=2; i<=n; i++)
      {
        dp[i]=dp[i-1]+dp[i-2];

      }
        return dp[n];
    }
}