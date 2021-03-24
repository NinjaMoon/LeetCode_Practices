
public class Solution0374 extends GuessGame {
    public int guessNumber(int n) {
        if (n == 1) return n;
        int low = 1;
        int high = n;
        while (low + 1 < high) {
            int mid = low + (high - low)/2;
            int res = guess(mid);
            if (res == 0) {
                return mid;
            } else if (res < 0) {
                high = mid;
            } else {
                low = mid;
            }
        }
        return guess(low) == 0 ? low : high;
    }
}
