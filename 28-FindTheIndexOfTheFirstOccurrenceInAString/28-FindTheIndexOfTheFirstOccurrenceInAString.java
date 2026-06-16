// Last updated: 6/16/2026, 10:09:35 AM
class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0,j=needle.length();j<=haystack.length();i++, j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}