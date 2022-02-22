class WordDictionary {

    Node root = new Node();
    
    public void addWord(String word) {
        Node temp = root;
        for(char ch : word.toCharArray()){
            if(temp.child[ch-'a']==null)
                temp.child[ch-'a'] = new Node();
            temp = temp.child[ch-'a'];
        }
        temp.isWord = true;
    }
    
    public boolean search(String word) {
        return helper(word.toCharArray(), 0, root);
    }
    
    boolean helper(char[] word, int index, Node temp){
        
        if(index == word.length)
            return temp.isWord;
        
        if(word[index]=='.'){
            for(int i=0;i<26;i++)
                if(temp.child[i]!=null && helper(word, index+1, temp.child[i]))
                    return true;
            return false;
        }
        temp = temp.child[word[index]-'a'];
        
        return (temp!=null) && helper(word, index+1, temp);
    }
    
    class Node{
        Node[] child = new Node[26];
        boolean isWord = false;
    }
}