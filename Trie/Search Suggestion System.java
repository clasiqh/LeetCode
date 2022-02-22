class Solution {
    
    Node root = new Node();
    List<List<String>> res = new ArrayList<>();
    
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        
        for(String product : products)
            insert(product);
        
        find(searchWord);
        return res;
    }
    
    void insert(String product){
        Node temp = root;
        for(char ch : product.toCharArray()){
            if(temp.child[ch-'a']==null)
                temp.child[ch-'a'] = new Node();
            
            temp = temp.child[ch-'a'];
        }
        temp.isWord = true;
    }
    
    void find(String searchWord){
        
        Node temp = root;
        String word = "";
        
        for(char ch : searchWord.toCharArray()){
            
            if(temp.child[ch-'a'] == null){
                while(res.size()<searchWord.length())
                    res.add(new ArrayList<>());
                return;
            }
            
            word += ch;
            List<String> list = new ArrayList<>();
            dfs(temp.child[ch-'a'], word, list);
            res.add(list);
            temp = temp.child[ch-'a'];
        }
        
    }
    
    void dfs(Node temp, String word, List<String> list){
        
        if(list.size()>=3)
            return;

        if(temp.isWord){
            list.add(word);
            for(int i=0; i<26; i++){
                if(temp.child[i]==null)
                    continue;
                dfs(temp.child[i], word+(char)(i+'a'), list);
            }
            
            return;
        }
        
        for(int i=0; i<26; i++){
            if(temp.child[i]==null)
                continue;
            dfs(temp.child[i], word+(char)(i+'a'), list);
        }
    }
    
    class Node{
        boolean isWord = false;
        Node[] child = new Node[26];
    }
}
