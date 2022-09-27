class Solution {
    public int[] smallerNumbersThanCurrent(int[] a) {
        int []count = new int[a.length];
        for(int i=0;i<a.length;i++){
            int ele=a[i];
            for(int j=0;j<a.length;j++){
                if(ele<a[j]){
                    count[j]++;
                }
                
            }
           
        }
        return count;
    }
}