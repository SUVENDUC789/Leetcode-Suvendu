class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int [][]item=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                if(image[i][j]==1){
                    item[i][image[i].length-j-1]=0;
                }
                else{
                    item[i][image[i].length-j-1]=1;
                }
            }
        }
        return item;
    }
}