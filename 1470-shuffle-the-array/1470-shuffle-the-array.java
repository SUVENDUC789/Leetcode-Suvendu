class Solution {
    public int[] shuffle(int[] a, int n) {
        int []b=new int[a.length];
        int []x=new int[a.length/2];
        int []y=new int[a.length/2];
        
        for(int i=0;i<a.length/2;i++){
            x[i]=a[i];
        }
        
        int m=0;
        for(int i=a.length/2;i<a.length;i++){
            y[m++]=a[i];
        }
        
        int k=0;
        for(int i=0;i<a.length-1;i+=2){
            b[i]=x[k];
            b[i+1]=y[k];
            k++;
        }
        return b;
        
    }
}