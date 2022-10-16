class Solution {
    public void sortColors(int[] a) {
        for(int i=0;i<a.length;i++){
            boolean issort=false;
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    issort=true;
                }
            }
            
            if(!issort){
                break;
            }
        }
        
    }
}