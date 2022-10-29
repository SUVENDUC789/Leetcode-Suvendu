class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                c++;
            }
        }
        // if Posetive value is present 
        if(c==0){
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        int [] hsh= new int [max+1];
        for(int i=0;i<nums.length;i++){
            hsh[nums[i]]++;
        }
        int fredigit=hsh[0];
        int because=0;
        for(int i=0;i<nums.length;i++){
            if(fredigit<hsh[nums[i]]){
                fredigit=hsh[nums[i]];
                because=nums[i];
            }
        }
        System.out.println(Arrays.toString(hsh));
        return because;
        }
        // if negative value is present 
        if(c!=0){
        int[] fre= new int [nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    fre[i]++;
                }
            }
        }
        int maxfre=fre[0];
        int maxdig=nums[0];
        for(int i=1;i<nums.length;i++){
            if(maxfre<fre[i]){
                maxfre=fre[i];
                maxdig=nums[i];
            }
        }
        // System.out.println(Arrays.toString(nums));
        // System.out.println(Arrays.toString(fre));
        return maxdig;
        }
        return 0;
    }
}