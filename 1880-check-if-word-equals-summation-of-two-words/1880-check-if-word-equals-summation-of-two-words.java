class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        
        if(val(firstWord)+val(secondWord)==val(targetWord)) return true;
        else return false;
    }

   public int val( String s){
        int char_map[] = new int[26];
        int r=0;
        for(int i=0 ; i<s.length() ; i++){
            char x = s.charAt(i);
            int v = x-'a';
            r = (r*10)+v;
            
        }
        return r;  
        }
    }