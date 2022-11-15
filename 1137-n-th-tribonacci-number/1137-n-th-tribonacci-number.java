class Solution {
    public static int []dp=new int[30+10];
    Solution(){
        for(int i=0;i<30+10;i++){
        dp[i]=-1;
        } 
    }
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        }
        else if(dp[n]!=-1){
            return dp[n];
        }

        dp[n]=tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
        return dp[n];
    }
}