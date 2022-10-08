class Solution {
    public int findPeakElement(int[] a) {
        int low=0;
        int high=a.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if(a[mid]>a[mid+1]){
                high=mid;
            }else{
                low=mid+1;
            }
            
        }
        return low;
    }
}