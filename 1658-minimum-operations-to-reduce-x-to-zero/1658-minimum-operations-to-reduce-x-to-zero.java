class Solution {
    public int minOperations(int[] nums, int x) {
        //instead of calc prefix+postfix that equal to x, we will calc the sum of a middle window and the window with max size will lead to the answer
        int l = 0, windowSum = 0, totalSum = 0, ans = Integer.MAX_VALUE;
        for (int r = 0; r < nums.length; r++)
            totalSum += nums[r];

        for (int r = 0; r < nums.length; r++) {
            windowSum += nums[r];//
            while (windowSum > totalSum - x && l<=r) {
                windowSum -= nums[l++];
            }
            if (windowSum == totalSum - x) {
                ans = Math.min(ans, nums.length - (r - l + 1));
            }
        }
        if (ans == Integer.MAX_VALUE)
            ans = -1;
        return ans;
    }
}