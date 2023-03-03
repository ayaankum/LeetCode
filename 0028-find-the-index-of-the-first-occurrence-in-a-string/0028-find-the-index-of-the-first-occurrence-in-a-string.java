class Solution {
    public int strStr(String s1, String s2) {
        int lenS1 = s1.length();
        int lenS2=s2.length();
        //if(lenS1 < lenS2) return -1;
        int i=0;
        while( lenS2 <= lenS1){
            String sub = s1.substring(i , lenS2);
            if( sub.equalsIgnoreCase(s2)) return i;

            else{
                i++;
                lenS2++;
            }
        }
        return -1;
    }
}