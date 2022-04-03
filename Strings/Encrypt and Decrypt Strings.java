class Encrypter {
    HashMap<String, Integer> dict = new HashMap<>();
    HashMap<Character, String> map = new HashMap<>();

    public Encrypter(char[] keys, String[] values, String[] dictionary) {
        for (int i = 0; i < keys.length; i++)
            map.put(keys[i], values[i]);

        for (String store : dictionary) {
            String val = encrypt(store);
            dict.put(val, dict.getOrDefault(val, 0) + 1);
        }
    }

    public String encrypt(String word1) {
        StringBuilder sb = new StringBuilder();
        for (char ch : word1.toCharArray())
            sb.append(map.get(ch));
        return sb.toString();
    }

    public int decrypt(String word2) {
        return dict.containsKey(word2) ? dict.get(word2) : 0;
    }
}