class Solution {
    public static int count(int[] a, int target) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                c++;
            }
        }
        return c;
    }
    public int[] searchRange(int[] a, int target) {

        int[] b = new int[count(a, target)];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                b[k] = i;
                k++;
            }
        }
        int[] c = {-1,-1 };
        if(count(a, target)!=0){
            c[0]=b[0];
            c[1]=b[b.length-1];
        }
        
        // System.out.println(Arrays.toString(c));
        return c;
        
    }
}