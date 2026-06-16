// Last updated: 6/16/2026, 10:08:32 AM
class Solution {
    public boolean doesAliceWin(String s) {
        int n = s.length();
        for(int i=0; i<n; i++){
            switch(s.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    return true;
            }
        }
        return false;
    }
}