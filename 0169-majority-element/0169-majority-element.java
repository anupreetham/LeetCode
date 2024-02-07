import java.util.Arrays; 
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
     int r= (nums.length/2)  ;
     System.out.println(r);
     return nums[r];
        
    }
}