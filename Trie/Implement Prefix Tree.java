class Trie {

    static final int RANGE = 26;
    Node root = new Node();

    public void insert(String word) {
        Node temp = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (temp.child[index] == null)
                temp.child[index] = new Node();
            temp = temp.child[index];
        }
        temp.isWord = true;
    }

    public boolean search(String word) {

        Node temp = root;
        int i = 0;
        for (char c : word.toCharArray()) {
            if (temp.child[c - 'a'] == null)
                return false;
            temp = temp.child[c - 'a'];
            i++;
        }

        return temp.isWord;
    }

    public boolean startsWith(String prefix) {
        Node temp = root;
        for (char c : prefix.toCharArray()) {
            if (temp.child[c - 'a'] == null)
                return false;
            temp = temp.child[c - 'a'];
        }
        return true;
    }

    class Node {

        Node[] child = new Node[RANGE];
        boolean isWord = false;

        public Node() {
            for (int i = 0; i < RANGE; i++)
                this.child[i] = null;
        }
    }
}