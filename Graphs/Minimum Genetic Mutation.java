class Solution {
    public int minMutation(String start, String end, String[] bank) {
        HashSet<String> bankSet = new HashSet<>();
        for (String gene : bank)
            bankSet.add(gene);

        Queue<String> q = new LinkedList<>();
        q.add(start);
        char[] idk = new char[] { 'A', 'C', 'G', 'T' };
        int step = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int k = 0; k < size; k++) {

                String curr = q.poll();
                if (curr.equals(end))
                    return step;
                char[] arr = curr.toCharArray();
                for (int i = 0; i < arr.length; i++) {
                    char old = arr[i];
                    for (char change : idk) {
                        arr[i] = change;
                        String temp = new String(arr);
                        if (bankSet.contains(temp)) {
                            bankSet.remove(temp);
                            q.add(temp);
                        }
                    }
                    arr[i] = old;
                }

            }
            step++;
        }
        return -1;
    }
}