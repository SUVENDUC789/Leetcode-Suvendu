class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=word(sentences[0]);
        for(int i=0;i<sentences.length;i++){
            int len=word(sentences[i]);
            if(max<len){
                max=len;
            }
        }
        return max;
        
    }
    public static int word(String s){
            int w=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==' '){
                    w++;
                }
            }
            return w+1;
        }
        
}