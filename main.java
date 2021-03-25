// 上下左右 recursion

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc]==newColor) return image;
        int oldColor=image[sr][sc];
        change(image,sr,sc,oldColor,newColor);
        return image;
    }
    void change(int[][]image,int row, int column,int oldColor,int newColor){
        int R=image.length;
        int C=image[0].length;
        if(image[row][column]==oldColor){
            image[row][column]=newColor;
                if(row>=1) change(image,row-1,column,oldColor,newColor);
                if(row<=R-2) change(image,row+1,column,oldColor,newColor);
                if(column>=1) change(image,row,column-1,oldColor,newColor);
                if(column<=C-2) change(image,row,column+1,oldColor,newColor);
        }   
    }
}
