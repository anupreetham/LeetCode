class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> arrList= new ArrayList<>();
        HashMap<Integer, Integer> hmap= new HashMap<>();
      for(int i=0; i<nums1.length; i++){
        if(!hmap.containsKey(nums1[i])){
            hmap.put(nums1[i],1);
        }
        else {
            hmap.put(nums1[i],hmap.get(nums1[i])+1);
        }
      }
      for(int j=0; j<nums2.length; j++){
        if(hmap.containsKey(nums2[j]) && (hmap.get(nums2[j])>0)){
            arrList.add(nums2[j]);
            hmap.put(nums2[j],hmap.get(nums2[j])-1);

        }
      }
       int[] intersectionArray = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            intersectionArray[i] = arrList.get(i);
        }

  return intersectionArray;  }
}