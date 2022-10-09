class Solution {
    public static int bs(int []a , int i, boolean findstartindex){
        int ans=-1;
        int low=0;
        int high=a.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==i){
               ans=mid;
                if(findstartindex){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else if(a[mid]>i){
                high=mid-1;
            }else{
               low=mid+1; 
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        
        int []ans={-1,-1};
        int start=bs(nums,target,true);
        int end=bs(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
}