// Last updated: 6/16/2026, 10:08:30 AM
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for(int i=left; i<=right; i++){
            String word = words[i];
            if(isVowel(word.charAt(0)) && isVowel(word.charAt(word.length()-1))){
                count++;
            }
        }
        return count;
    }
    private boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}