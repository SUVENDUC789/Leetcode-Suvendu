class Solution {
    public String truncateSentence(String s, int k) {
        String[] arrOfStr = s.split(" ");
        if(arrOfStr.length==k){
            return s;
        }
        String[] newstr=new String[k];
        for(int i=0;i<k;i++){
            newstr[i]=arrOfStr[i];
        }
        return String.join(" ",newstr);
        
    }
}