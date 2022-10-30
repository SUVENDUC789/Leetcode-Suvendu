class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int increment=0;
        int decrement=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("++X") || operations[i].equals("X++"))
            {
                increment++;
            }
            else if(operations[i].equals("--X") || operations[i].equals("X--"))
            {
                decrement++;
            }
            
        }
//         System.out.println(increment);
        
//         System.out.println(decrement);
        
        return (increment-decrement);
    }
}