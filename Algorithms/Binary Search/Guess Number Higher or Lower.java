public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1, right = n;

        while (left <= right) {
            int mid = left + ((right - left) / 2);
            int ans = guess(mid);
            if (ans == 0)
                return mid;
            else if (ans == -1)
                right = mid - 1;
            else
                left = mid + 1;
        }

        return left;
    }
}