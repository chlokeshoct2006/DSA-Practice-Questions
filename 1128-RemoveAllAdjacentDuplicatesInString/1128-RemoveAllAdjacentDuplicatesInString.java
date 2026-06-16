// Last updated: 6/16/2026, 10:08:40 AM
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!stack.isEmpty() && stack.peek()==c){
               stack.pop(); 
            }
            else{
                stack.push(c);
            }
        }
        StringBuilder st=new StringBuilder();
        while(!stack.isEmpty()){
            st.append(stack.pop());
        }
        st.reverse();
        return st.toString();
    }
}