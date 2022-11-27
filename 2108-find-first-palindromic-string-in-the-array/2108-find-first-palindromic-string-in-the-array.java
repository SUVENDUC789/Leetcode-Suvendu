class Solution {
    public String firstPalindrome(String[] words) {
        String ans="";
      
        for(String w : words){
            StringBuilder reverseString = new StringBuilder(w);
            reverseString.reverse();
            String s2=  reverseString.toString();
            if(s2.equals(w)){
                return w;
            }
        }
        
        return ans;
    }
}