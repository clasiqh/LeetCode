class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> x = new PriorityQueue<>(Collections.reverseOrder());
        double sum = 0;
        for (int num : nums) {
            sum += num;
            x.add((double) num);
        }

        double temp = sum;
        int count = 0;

        while (temp > sum / 2) {
            count++;
            double curr = x.poll();
            temp = temp - curr + curr / 2;
            x.add(curr / 2.0);
        }

        return count;
    }
}