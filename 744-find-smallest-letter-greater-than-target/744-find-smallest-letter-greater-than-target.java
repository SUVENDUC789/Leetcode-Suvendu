class Solution {
    public char nextGreatestLetter(char[] a, char target) {
        int low=0;
        int high=a.length-1;
        
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
           
        }
        
         return a[low%a.length];
    }
}