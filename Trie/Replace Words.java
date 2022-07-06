class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        HashSet<String> root = new HashSet<>();
        for(String word : dictionary)
            root.add(word);
        
        StringBuilder sb = new StringBuilder();
        StringBuilder word = new StringBuilder();
        
        String temp = "";
        for(char ch : sentence.toCharArray()){
            if(ch==' '){
                String curr = temp!="" ? temp : word.toString();
                sb.append(curr);
                temp = "";
                sb.append(" ");
                word = new StringBuilder();
                continue;
            }
            word.append(ch);
            if(root.contains(word.toString()) && temp=="")
                temp = word.toString();
        }
        
        String curr = temp!="" ? temp : word.toString();
        sb.append(curr);
        
        return sb.toString();
    }
}