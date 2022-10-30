class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // Arrays.sort(nums);
        List<Integer> llist=new LinkedList<Integer>();
        int []hsh=new int [nums.length+1];
        for(int i=0;i<nums.length;i++){
            hsh[nums[i]]++;
        }
        for(int i=1;i<=nums.length;i++){
            if(hsh[i]==0){
                llist.add(i);
            }
        }
        // Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        // System.out.println(Arrays.toString(hsh));
        
        
        // System.out.println(llist.toString());
        return llist;
    }
}