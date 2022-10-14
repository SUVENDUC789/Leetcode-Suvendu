class Solution {
    public int diagonalSum(int[][] mat) {
        if(mat.length%2==0){
            int sum1=0;
            for(int i=0;i<mat.length;i++){
                sum1+=mat[i][i]+mat[i][mat.length-i-1];
            }
            return sum1;
        }
        int sum=0;
        for(int i=0;i<mat.length;i++){
                sum+=mat[i][i]+mat[i][mat.length-i-1];
        }
        return sum-mat[mat.length/2][mat.length/2];
        
    }
}