class Solution {
    public int[] getConcatenation(int[] a) {
        int []b=new int[2*a.length];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
            b[i+a.length]=a[i];
        }
        return b;
    }
}