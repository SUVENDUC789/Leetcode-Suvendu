class Solution {
    public boolean searchMatrix(int[][] a, int target) {
        for(int []x:a){
        for(int i:x){
            if(i==target){
                return true;
            }
        }
    }
        return false;
    }
}