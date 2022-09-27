class Solution {
    public static boolean even(int n){
        if(n==0){return true;}
        if(n<0){
            n=n*(-1);
        }
        int c=0;
        while(n!=0){
            c++;
            n=n/10;
        }
        return c%2==0;
    }
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i:nums){
            if(even(i)){c++;}
            
        }
        return c;
    }
}