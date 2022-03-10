class Solution {
    public int openLock(String[] deadends, String target) {
        HashSet<String> ends = new HashSet<>();
        for (String str : deadends)
            ends.add(str);
        if (ends.contains("0000"))
            return -1;
        Queue<String> q = new LinkedList<>();
        q.add("0000");
        ends.add("0000");
        for (int step = 0; !q.isEmpty(); step++) {
            int size = q.size();
            for (int k = 0; k < size; k++) {
                String temp = q.poll();
                if (temp.equals(target))
                    return step;
                char[] arr = temp.toCharArray();
                for (int i = 0; i < 4; i++) {

                    char old = arr[i];
                    arr[i] = old == '9' ? '0' : (char) (old + 1);
                    String next = new String(arr);
                    arr[i] = old == '0' ? '9' : (char) (old - 1);
                    String prev = new String(arr);

                    if (!ends.contains(next)) {
                        q.add(next);
                        ends.add(next);
                    }
                    if (!ends.contains(prev)) {
                        q.add(prev);
                        ends.add(prev);
                    }
                    arr[i] = old;
                }
            }
        }
        return -1;
    }
}