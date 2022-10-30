class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int increment=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("++X") || operations[i].equals("X++"))
            {
                increment++;
            }
            else if(operations[i].equals("--X") || operations[i].equals("X--"))
            {
                increment--;
            }
            
        }
        return increment;
    }
}