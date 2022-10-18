class Solution {
    public static int []dp=new int[30+100];
    Solution(){
        for(int i=0;i<30+100;i++){
        dp[i]=-1;
        } 
    }

    public int fib(int n) {
       if(n==0)return 0;
        if(n==1)return 1;
        if(dp[n]!=-1)return dp[n];
        dp[n]=fib(n-1)+fib(n-2);
        return dp[n];
        
    }
}