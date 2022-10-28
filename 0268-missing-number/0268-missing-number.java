class Solution {
    public int missingNumber(int[] nums) {
        
        int []range=new int [nums.length+1];
        
        // [0, n]
        for(int i=0;i<=nums.length;i++){
            range[i]=i;
        }
        
        for(int i=0;i<=nums.length;i++){
            int check=range[i];
            for(int j=0;j<nums.length;j++){
                if(check==nums[j]){
                    check=-108;
                }
            }
            if(check!=-108){
                return check;
            }
        }
        
        // System.out.println(Arrays.toString(range));
        
        return 0;
        
    }
}