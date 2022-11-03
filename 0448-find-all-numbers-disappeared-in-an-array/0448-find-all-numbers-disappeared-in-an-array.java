class Solution {
    public boolean search(int num,int[] a){
        int low=0;
        int high=a.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==num){
                return true;
            }else if(num>a[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;
        
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> llist=new LinkedList<Integer>();
        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        for(int i=1;i<=nums.length;i++){
            if(!search(i,nums)){
                llist.add(i);
            }
        }
        return llist;
    }
}