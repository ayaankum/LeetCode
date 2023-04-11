class Solution {
    public String removeStars(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        String st ="";
        for(final char c : s.toCharArray()){
            if(c != '*'){
                stack.add(c);
            }
            else if(c == '*'){
                stack.pollLast();
            }
        }
        
        Object[] ar = stack.toArray();
        for(int i=0 ; i<ar.length;i++){
            st =st+ar[i];
        }
        return st;
        
    }
}