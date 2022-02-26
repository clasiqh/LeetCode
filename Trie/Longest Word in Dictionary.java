class Solution {
    Node root = new Node();
    String ans = "";

    class Node {
        Node[] child = new Node[26];
        boolean isWord = false;
    }

    public String longestWord(String[] words) {
        for (String word : words) {
            Node temp = root;
            for (char ch : word.toCharArray()) {
                if (temp.child[ch - 'a'] == null)
                    temp.child[ch - 'a'] = new Node();
                temp = temp.child[ch - 'a'];
            }
            temp.isWord = true;
        }

        root.isWord = true;
        dfs(root, 0, new StringBuilder());
        return ans;
    }

    void dfs(Node temp, int index, StringBuilder sb) {
        if (!temp.isWord)
            return;
        if (temp != root)
            sb.append((char) (index + 'a'));
        if (ans.length() < sb.length())
            ans = sb.toString();

        for (int i = 0; i < 26; i++) {
            if (temp.child[i] == null)
                continue;
            dfs(temp.child[i], i, sb);
        }
        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);
    }
}