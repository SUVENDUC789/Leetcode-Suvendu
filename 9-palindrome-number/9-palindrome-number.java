class Solution {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        StringBuilder reverseString = new StringBuilder(s);
        reverseString.reverse();
        String s2=  reverseString.toString();

        
        return s2.equals(s);
        
        
    }
}