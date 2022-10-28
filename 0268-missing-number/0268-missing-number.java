class Solution {
    public int missingNumber(int[] nums) {
        
        for(int i=0;i<=nums.length;i++){
            int check=i;
            for(int j=0;j<nums.length;j++){
                if(check==nums[j]){
                    check=-108;
                }
            }
            if(check!=-108){
                return check;
            }
        }
                
        return 0;
        
    }
}