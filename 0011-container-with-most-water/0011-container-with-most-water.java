class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int area=0;
        int b=0;
       int i=0;
       int j=height.length-1;
       while(i<=j){
        l=Math.min(height[i],height[j]);
        b=j-i;
        area=Math.max(area,l*b);
        if(height[i]<height[j]){
            i++;
        }
        else if(height[j]<height[i]){
            j--;
        }
       else{
            j--;

        }
       }
        return area;
        
    }
}