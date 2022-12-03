class Solution {
    public boolean areNumbersAscending(String s) {
        String[] result = s.split(" ");
        ArrayList<Integer> a = new ArrayList<>();
        for (String i : result) {
            try {
                int n = Integer.parseInt(i);
                a.add(n);
            } catch (Exception e) {
            }
        }
        for(int i=0;i<a.size()-1;i++)
        {
            if(a.get(i)>a.get(i+1) || a.get(i)==a.get(i+1))
            {
                return false;
            }
        }
        return true;
    }
}