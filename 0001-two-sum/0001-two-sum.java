class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer, Integer>hmap= new HashMap<>();
    int [] result= new int[]{0,0};
      for(int i=0; i<nums.length; i++){
        int  find=target-nums[i];
        if(hmap.containsKey(find))
        {
          result[0]=i;
          result[1]=hmap.get(find);
          break;
        }
        else{
          hmap.put(nums[i],i);
        }
       
      }
       return result;
    }
}