class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color){
            return image;
        }
     int old_colour= image[sr][sc];
        fill(image,sr,sc, color,old_colour);
        return image;
    }

    public void fill(int[][] image, int sr, int sc, int color,int old_colour){
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length|| image[sr][sc]!=old_colour ){
return;
        }
        image[sr][sc]=color;
        fill(image, sr+1, sc, color,old_colour);
        fill(image, sr-1, sc, color,old_colour);
        fill(image, sr,  sc+1, color,old_colour);
        fill(image, sr,  sc-1, color,old_colour);
        
    }
}