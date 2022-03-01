class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int right = 1, left = 1;
        for (int pile : piles)
            right = Math.max(right, pile);

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (check(mid, h, piles))
                right = mid - 1;
            else
                left = mid + 1;
        }

        return left;
    }

    boolean check(int num, int h, int[] piles) {
        int hr = 0;
        for (int pile : piles) {
            hr += pile / num;
            if (pile % num != 0)
                hr++;
            if (hr > h)
                return false;
        }
        return true;
    }
}