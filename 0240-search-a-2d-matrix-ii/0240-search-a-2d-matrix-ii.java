class Solution {
    public static boolean search(int []a,int t){
        int low=0;
        int high=a.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(a[low]==t){
                return true;
            }else if(a[high]==t){
                return true;
            }
            else if(a[mid]==t){
                return true;
            }else if(a[mid]>t){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] a, int target) {
      for(int []x:a){
          if(search(x,target)){
              return true;
          }
      }
        return false;
    }
}