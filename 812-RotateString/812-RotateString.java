// Last updated: 6/16/2026, 10:08:47 AM
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal))
            return true;
        else if(s.length()!=goal.length())
            return false;
        for(int i=1; i<s.length(); i++){
            s=s.substring(1)+s.charAt(0);
            if(s.equals(goal)){
                return true;
            }
        }
        return false;
    }
}