class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> x = new HashMap<>();
        
        for(String str : strs){
            char[] arr = new char[26];
            for(char ch : str.toCharArray())
                arr[ch-'a']++;
            String hash = new String(arr);
            if(!x.containsKey(hash))
                x.put(hash, new ArrayList<>());
            x.get(hash).add(str);
        }
        
        for(List<String> lst : x.values())
            res.add(lst);
        return res;
    }
}