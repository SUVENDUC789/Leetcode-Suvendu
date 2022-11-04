class Solution {
    public boolean find(int []a,int num){
        int low=0;
        int high=a.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==num){
                return true;
            }else if(a[mid]>num){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return false;
    }
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int []ans=new int [2];
        for(int i=1;i<=nums.length;i++){
            if(!find(nums,i)){
                ans[1]=i;
                break;
            }
        }
        int []hsh=new int [nums.length+1];
        for(int i=0;i<nums.length;i++){
            hsh[nums[i]]++;
        }
        for(int i=0;i<nums.length;i++){
            if(hsh[nums[i]]>1){
                ans[0]=nums[i];
                break;
            }
        }
        return ans;
        
    }
}