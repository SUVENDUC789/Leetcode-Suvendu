class Solution {

    public int findNumbers(int[] nums) {
        int c=0;
        for(int i:nums){
            if(((int) (Math.log10(i)) + 1)%2==0){c++;}
            
        }
        return c;
    }
}