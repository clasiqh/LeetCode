class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int ans = make(curr, mapping);
            q.add(new int[] { ans, i });
        }

        int[] res = new int[nums.length];
        for (int i = 0; !q.isEmpty(); i++)
            res[i] = nums[q.poll()[1]];
        return res;
    }

    int make(int curr, int[] mapping) {
        int ans = 0;
        Deque<Integer> x = new ArrayDeque<>();
        if (curr == 0)
            x.push(0);
        while (curr != 0) {
            x.push(curr % 10);
            curr = curr / 10;
        }
        while (!x.isEmpty()) {
            ans = ans * 10;
            ans += mapping[x.pop()];
        }
        return ans;
    }
}