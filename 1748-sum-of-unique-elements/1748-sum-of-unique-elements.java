class Solution {
    public int sumOfUnique(int[] a) {
        int N=100+10;
        int []hsh=new int[N];
        for(int i=0;i<a.length;i++){
            hsh[a[i]]++;
        }
        
        int sum=0;
        for(int i=0;i<a.length;i++){
            if(hsh[a[i]]==1){
                sum+=a[i];
            }
        }
        // System.out.println(Arrays.toString(hsh));
        return sum;
    }
}