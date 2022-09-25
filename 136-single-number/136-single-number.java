class Solution {
    public int singleNumber(int[] nums) {
        int []a=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            a[i]=0;
        }
        
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    a[i]+=1;
                }
            }
        }
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(a[i]==1){
                k=nums[i];
            }
        }
        
        return k;
    }
}