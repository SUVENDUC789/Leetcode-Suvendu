class Solution {
    public int repeatedNTimes(int[] nums) {
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        
        int []hsh=new int [max+1];
        for(int i=0;i<nums.length;i++){
            hsh[nums[i]]++;
        }
        
        for(int i=0;i<nums.length;i++){
            if(hsh[nums[i]]>1){
                return nums[i];
            }
        }
        return 0;
    }
}