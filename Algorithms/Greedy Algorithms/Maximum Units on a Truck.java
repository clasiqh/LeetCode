class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int res = 0;
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        for (int[] arr : boxTypes) {
            int take = Math.min(truckSize, arr[0]);
            res += take * arr[1];
            truckSize -= take;
            if (truckSize == 0)
                break;
        }
        return res;
    }
}