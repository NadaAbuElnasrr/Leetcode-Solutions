class Solution {
    public int maxFrequency(int[] nums, int k) {
        int maxFreq = 0, l = 0;
        long currentSum = 0;
        Arrays.sort(nums);
        for (int r = 0; r < nums.length; r++) {
            currentSum += nums[r];
            while ((long)nums[r] * (r - l + 1) - currentSum > k) {
                currentSum -= nums[l];
                l++;
            }
            maxFreq = Integer.max(maxFreq, r - l + 1);
        }
        return maxFreq;
    }
}