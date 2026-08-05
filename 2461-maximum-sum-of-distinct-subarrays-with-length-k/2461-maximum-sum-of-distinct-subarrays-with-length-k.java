class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        //fixed sliding window 
        HashMap<Integer, Integer> freq = new HashMap<>();
        long maxSum = 0, windowSum = 0;
        for (int i = 0; i < k; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            windowSum += nums[i];
        }
        if (freq.size() == k) {
            maxSum = Long.max(maxSum, windowSum);
        }
        for (int i = k; i < nums.length; i++) {

            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            freq.put(nums[i - k], freq.getOrDefault(nums[i - k], 0) - 1);
            if (freq.get(nums[i - k]) == 0)
                freq.remove(nums[i - k]);
            windowSum += nums[i];
            windowSum -= nums[i - k];
            if (freq.size() == k) {
                maxSum = Long.max(maxSum, windowSum);
            }
        }
        return maxSum;
    }
}