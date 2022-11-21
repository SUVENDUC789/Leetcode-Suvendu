class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int []a=new int [nums.length];
        int k=0,frepi=0;
        for(int n : nums){
            if(n<pivot){
                a[k]=n;
                k++;
            }
            else if(n==pivot){
                frepi++;
            }
        }
        
        for(int i=0;i<frepi;i++){
            a[k]=pivot;
            k++;
        }
        
        for(int n: nums){
            if(n>pivot){
                a[k]=n;
                k++;
            }
        }
        
        return a;
    }
}