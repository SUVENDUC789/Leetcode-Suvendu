class Solution {
    public int minOperations(String[] logs) {
        ArrayList<String> stack = new ArrayList<>();
        for (String item : logs) {
            if (!item.equals("./")) {
                if (!item.equals("../"))
                    stack.add(item);
                else {
                    try {
                        stack.remove((stack.size() - 1));
                    } catch (Exception e) {
                        // Block of code to handle errors
                    }
                }
            }
        }

        int c = 0;
        while (stack.size() != 0) {
            stack.remove((stack.size() - 1));
            c++;
        }
        return c;
    }
}