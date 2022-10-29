class Solution {
    public int missingNumber(int[] nums) {
        
        int []hsh=new int [nums.length+1];
        for (int i=0;i<nums.length;i++){
            hsh[nums[i]]=1;
        }
        
        for(int i=0;i<=nums.length;i++){
            if(hsh[i]==0){
                return i;
            }
        }
    
                
        return 0;
        
    }
}