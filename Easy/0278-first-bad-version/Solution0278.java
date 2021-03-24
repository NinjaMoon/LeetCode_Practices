
public class Solution0278 extends VersionControl {
    public int firstBadVersion(int n) {
        // corner case
        if (n <= 0) return n; 
        // base case
        if (n == 1) return isBadVersion(n) ? 1 : 0;
        
        int left = 1;
        int right = n;
        while (left + 1 < right) {
            int mid = left + (right - left)/2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return isBadVersion(left) ? left : right; 
    }
}

