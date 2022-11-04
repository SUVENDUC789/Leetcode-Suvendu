class Solution {
    private static boolean find(int[]a,int num){
        int low=0;
        int high=a.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[low]==num){return true;}
            else if(a[high]==num){return true;}
            else if(a[mid]==num){
                return true;
            }else if(a[mid]>num){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return false;
    }
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int max=nums.length+1;
        for(int i=1;i<=max;i++){
            if(!find(nums,i)){
                return i;
            }
        }
        return 1;
    }
}