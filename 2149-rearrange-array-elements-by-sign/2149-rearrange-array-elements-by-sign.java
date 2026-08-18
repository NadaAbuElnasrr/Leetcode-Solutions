class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int nextNeg = 1, nextPos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 && nextNeg < nums.length) {
                ans[nextNeg] = nums[i];
                nextNeg += 2;
            } else if (nums[i] > 0 && nextPos < nums.length) {
                ans[nextPos] = nums[i];
                nextPos += 2;
            }
        }
        return ans;
    }
}