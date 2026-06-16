// Last updated: 6/16/2026, 10:08:55 AM
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false; 
        }

        int freq[] = new int[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for(int f=0; f<freq.length-1; f++){
            if(freq[f] != 0){
                return false;
            }
        }
        return true;
    }
}