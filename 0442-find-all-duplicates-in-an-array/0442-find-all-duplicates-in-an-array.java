class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> llist=new LinkedList<Integer>();
        Arrays.sort(nums);
        int []hsh=new int [nums.length+1];
        for(int i=0;i<nums.length;i++){
            hsh[nums[i]]++;
        }
        for(int i=0;i<nums.length;i++){
            if(hsh[nums[i]]>1 ){
                llist.add(nums[i]);
                hsh[nums[i]]=0;
            }
        }
        return llist;
    }
}