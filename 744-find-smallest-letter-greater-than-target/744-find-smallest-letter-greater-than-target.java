class Solution {
    public char nextGreatestLetter(char[] a, char target) {
        for (int i = 0; i < a.length; i++) {
            if (target < a[i]) {
                return a[i];
            }
        }
        return a[0];
        
    }
}