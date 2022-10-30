class Solution {
    public String truncateSentence(String s, int k) {
        String[] arrOfStr = s.split(" ");
        String[] newstr=new String[k];
        for(int i=0;i<k;i++){
            newstr[i]=arrOfStr[i];
        }
        // System.out.println(Arrays.toString(newstr));
        // System.out.println(Arrays.toString(arrOfStr));
        
        return String.join(" ",newstr);
        
    }
}