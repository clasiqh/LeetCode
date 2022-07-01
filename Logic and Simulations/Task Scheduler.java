class Solution {
    public int leastInterval(char[] tasks, int n) {

        int[] arr = new int[26];
        for (char ch : tasks)
            arr[ch - 'A']++;

        Queue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != 0)
                pq.add(arr[i]);

        int time = 0;
        HashMap<Integer, Integer> x = new HashMap<>();
        while (!pq.isEmpty() || !x.isEmpty()) {
            if (x.containsKey(time))
                pq.add(x.remove(time));

            if (!pq.isEmpty()) {
                int curr = pq.poll();
                int sched = time + n + 1;
                if (curr - 1 > 0)
                    x.put(sched, curr - 1);
            }
            time++;
        }
        return time;
    }
}