public class 169MajorityElement {
    //169. Majority Element: https://leetcode.com/problems/majority-element/description/
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
     int result= (nums.length/2)  ;
   //  System.out.println(r);
     return nums[result];
        
    }
    
}
