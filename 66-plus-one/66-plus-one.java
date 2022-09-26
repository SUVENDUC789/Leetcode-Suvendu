class Solution {
    public int[] plusOne(int[] a) {
        int n=a.length;
        if (a[n-1]!=9){
            a[n-1]+=1;
            return a;
        }
        for(int i=n-1;i>=0;--i){
            if(a[i]==9){
                a[i]=0;
            }
            else{
                a[i]+=1;
                return a;
            }
        }
        
        int []ex=new int[a.length+1];
        ex[0]=1;
        
        return ex;
    }
}