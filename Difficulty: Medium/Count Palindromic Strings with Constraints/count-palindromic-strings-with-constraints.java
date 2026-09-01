class Solution {
    public int palindromicStrings(int n, int k) {
        long MOD = 1000000007;
        long ans = 0;
        long perm = 1;

        for (int h = 0; h <= k; h++) {

            // Odd length = 2h + 1
            // Middle character must be unused
            if (2 * h + 1 <= n && h < k) {
                ans = (ans + perm * (k - h)) % MOD;
            }

            // Even length = 2h
            if (h > 0 && 2 * h <= n) {
                ans = (ans + perm) % MOD;
            }

            // Calculate P(k, h+1)
            if (h < k) {
                perm = (perm * (k - h)) % MOD;
            }
        }

        return (int) ans;
    }
}