class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> words = new HashSet<>();
        for(String str : wordList) words.add(str);
        if(!words.contains(endWord)) return 0;
        
        int step = 1;
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int k=0; k<size; k++){
                String curr = q.poll();
                char[] arr = curr.toCharArray();
                
                for(int i=0; i<arr.length; i++){
                    char old = arr[i];
                    for(int alph=0; alph<26; alph++){
                        arr[i] = (char)('a'+alph);
                        String temp = new String(arr);
                        if(temp.equals(endWord)) return step+1;
                        if(words.contains(temp)){
                            q.add(temp);
                            words.remove(temp);
                        }
                    }
                    arr[i] = old;
                }
                
            }
            step++;
        }
        
        return 0;
    }
}