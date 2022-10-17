class Solution {
    public String[] sortPeople(String[] n, int[] h) {
        
        for(int i=0;i<h.length;i++){
            for(int j=0;j<h.length-i-1;j++){
                if(h[j]<h[j+1]){
                    int temp=h[j];
                    String t = n[j];
                    
                    h[j]=h[j+1];
                    n[j]=n[j+1];
                    
                    h[j+1]=temp;
                    n[j+1]=t;
                }
            }
        }
        
        return n;
        
    }
}