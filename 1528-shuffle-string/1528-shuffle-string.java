class Solution {
    public String restoreString(String s, int[] a) {
        char[] ch = new char[a.length];
        
         for (int i = 0; i < a.length; i++) {
            ch[i] = s.charAt(i);
        }
        
        for (int i = 0; i < a.length; i++) {
            boolean isSort=false;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    char character = ch[j];

                    a[j] = a[j + 1];
                    ch[j] = ch[j + 1];

                    a[j + 1] = temp;
                    ch[j + 1] = character;

                    isSort=true;

                }

            }
            if(!isSort){
                break;
            }
        }
        
        String s2="";
        for(int i=0;i<a.length;i++){
            s2+=ch[i];
        }
        
        return s2;
    }
}