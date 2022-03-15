class Solution {
    public String minRemoveToMakeValid(String s) {
        boolean[] bool = new boolean[s.length()];
        Stack<Integer> st = new Stack<Integer>();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(')
                st.push(i);
            else if(s.charAt(i) == ')'){
                if(!st.isEmpty()){
                    bool[i] = true;
                    bool[st.pop()] = true; 
                }
            }
            else bool[i] = true;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++)
            if(bool[i]) sb.append(s.charAt(i));
        
        return sb.toString();
    }
}