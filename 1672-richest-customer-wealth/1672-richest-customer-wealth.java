class Solution {
    public int maximumWealth(int[][] a) {
        int max=a[0][0];
        for(int []i : a){
            int sum=0;
            for(int j: i){
                sum+=j;
                
            }
            if(max<sum){
                max=sum;
            }
        }
        
        return max;
        
    }
}