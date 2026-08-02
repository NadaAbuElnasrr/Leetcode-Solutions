class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxSum = 0, windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        maxSum = windowSum;
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Double.max(windowSum, maxSum);
        }
        double avg = maxSum / k;
        return avg;
    }
}