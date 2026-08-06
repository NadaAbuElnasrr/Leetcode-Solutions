class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0, l = 0, ans = Integer.MAX_VALUE;
        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            while (sum >= target) {
                ans = Math.min(ans, r - l + 1);
                sum -= nums[l++];
            }
        }
        if (ans == Integer.MAX_VALUE)
            return 0;
        return ans;
    }
}