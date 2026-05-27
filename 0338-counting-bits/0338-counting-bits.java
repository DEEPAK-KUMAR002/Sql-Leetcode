class Solution {
    public int[] countBits(int n) {

        // Result array of size n + 1
        int[] ans = new int[n + 1];

        // Base case:
        // ans[0] = 0 because binary of 0 has no set bits

        // Calculate set bits for every number from 1 to n
        for (int i = 1; i <= n; i++) {

            /*
             i >> 1  -> removes last bit
             i & 1   -> checks if last bit is 1 or 0

             Formula:
             ans[i] = ans[i / 2] + (i % 2)
            */
            ans[i] = ans[i >> 1] + (i & 1);
        }

        return ans;
    }
}