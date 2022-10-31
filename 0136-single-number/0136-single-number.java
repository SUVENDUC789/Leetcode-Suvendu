class Solution {
    public int singleNumber(int[] nums) {
        int check=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                check=1;
                break;
            }
        }
        if(check==1){
            for(int i=0;i<nums.length;i++){
                int c=0;
                int num=nums[i];
                for(int j=0;j<nums.length;j++){
                    if(num==nums[j]){
                        c++;
                    }
                }
                if(c==1){
                    return num;
                }
            }
        }
        if(check==0){
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        int [] hsh=new int [max+1];
        for(int i=0;i<nums.length;i++){
            hsh[nums[i]]++;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                if(hsh[nums[i]]==1){
                    return nums[i];
                }
            }
        }}
        // Syatem.out.println(Arrays.toString(nums));
        // Syatem.out.println(Arrays.toString(hsh));
        return 0;
    }
}