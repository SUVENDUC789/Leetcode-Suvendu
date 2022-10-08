class Solution {
    public int findPeakElement(int[] a) {
        int max=a[0];
        int index=0;
        for(int i=1;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
                index=i;
            }
        }
        return index;
    }
}