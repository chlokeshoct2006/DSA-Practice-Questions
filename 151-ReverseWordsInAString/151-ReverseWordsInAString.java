// Last updated: 6/16/2026, 10:09:14 AM
import java.util.*;
class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder s1 = new StringBuilder();
        for(int i=words.length-1; i>=0; i--){
            s1.append(words[i]);
            if(i!=0) {
                s1.append(" ");
            }
        }
        return s1.toString();
    }
}