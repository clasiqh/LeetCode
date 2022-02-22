/*
There's no need for dfs here, but I did it anyway just for practice.
Better Solution:
https://leetcode.com/problems/map-sum-pairs/discuss/1371761/
*/

class MapSum {
    
    class Node{
        int val;
        boolean isKey = false;
        Node[] child = new Node[26];
    }
    
    Node root = new Node();
    
    public void insert(String key, int val) {
        Node temp = root;
        for(char ch : key.toCharArray()){
            if(temp.child[ch-'a']==null)
                temp.child[ch-'a'] = new Node();
            temp = temp.child[ch-'a'];
        }
        temp.isKey = true;
        temp.val = val;
    }
    
    public int sum(String prefix) {
        Node temp = root;
        for(char ch : prefix.toCharArray()){
            if(temp.child[ch-'a']==null)
                return 0;
            temp = temp.child[ch-'a'];
        }
        return dfs(temp, new int[1]);
    }
    
    int dfs(Node root, int[] sum){ //or use global variable for sum.
        if(root.isKey)
            sum[0]+=root.val;
        
        for(int i=0;i<26;i++)
            if(root.child[i]!=null)
                dfs(root.child[i], sum);
        
        return sum[0];
    }

}