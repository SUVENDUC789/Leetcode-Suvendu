class Solution {
    public int[] runningSum(int[] nums) {
        int []a=new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=0;j<=i;j++){
                sum+=nums[j];
                
            }
            // System.out.println(sum);
            a[i]=sum;
        }
        
        return a;
        
    }
}