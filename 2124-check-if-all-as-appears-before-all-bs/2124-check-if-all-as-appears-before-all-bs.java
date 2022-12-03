class Solution {
    public boolean checkString(String a) {
        for (int i = 0; i < a.length() - 1; i++) {
            char ch1 = a.charAt(i);
            char ch2 = a.charAt(i + 1);
            if (ch1 > ch2) {
               return false;
            }

        }
        return true;
        
    }
}