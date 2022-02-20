class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        if (finalSum % 2 != 0)
            return new ArrayList<>();

        long x = 0, sum = 0;
        List res = new ArrayList<Long>();
        while (sum < finalSum) {
            x += 2;
            if (finalSum < sum + x) {
                x -= 2;
                break;
            }
            sum += x;
            res.add(x);
        }

        if (sum == finalSum)
            return res;

        while (finalSum != sum) {
            long last = (long) res.get(res.size() - 1);
            res.remove(res.size() - 1);
            sum -= last;
            if ((long) res.get(res.size() - 1) < (finalSum - sum)) {
                res.add(finalSum - sum);
                break;
            }
        }

        return res;
    }
}