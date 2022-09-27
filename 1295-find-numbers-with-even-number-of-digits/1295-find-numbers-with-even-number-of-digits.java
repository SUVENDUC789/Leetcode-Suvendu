class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i:nums){
            String s=Integer.toString(i);
            int n=s.length();
            if(n%2==0){c++;}
        }
        return c;
    }
}