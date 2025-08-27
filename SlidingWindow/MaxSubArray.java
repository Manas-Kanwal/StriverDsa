package SlidingWindow;

class Solution {
    public int longestSubarray(int[] arr, int k) {
        int n = arr.length;
        int l = 0, r = 0;
        int sum = 0, maxLen = 0;

        while (r < n) {
            sum += arr[r];
            r++;

            while (sum > k && l < r) {
                sum -= arr[l];
                l++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, r - l);
            }
        }
        return maxLen;
    }
}
