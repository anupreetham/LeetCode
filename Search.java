package Java_pract;

public class Search {
public static void main(String[] args) {
    int nums[]={1,2,4,6,7,9,13,11};
    int target=9;
    int result=linearSearch(nums, target);
    System.out.println("Element found at Index : "+ result);
}

public static int linearSearch(int[] nums, int target) {
for (int i=0; i<nums.length; i++){
    if(nums[i]==target){
        return i;

    }
}
    
 
return -1;
}
}