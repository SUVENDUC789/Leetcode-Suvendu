class Solution {
    public int[] getConcatenation(int[] a) {
        int []b=new int[2*a.length];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        for(int i=a.length;i<2*a.length;i++){
            b[i]=a[i-a.length];
        }
        return b;
    }
}