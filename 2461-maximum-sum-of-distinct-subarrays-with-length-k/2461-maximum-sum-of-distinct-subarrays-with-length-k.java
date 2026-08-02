class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0, windowSum = 0;
        int l = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int r = 0; r < nums.length; r++) {
            freq.put(nums[r], freq.getOrDefault(nums[r], 0) + 1);
            windowSum += nums[r];
            if (r - l + 1 == k) {
                if (freq.size() == k) {
                    if (windowSum > maxSum)
                        maxSum = windowSum;
                }
                windowSum -= nums[l];
                freq.put(nums[l], freq.get(nums[l]) - 1);
                if(freq.get(nums[l])==0) freq.remove(nums[l]);
                l++;
            }
        }
        return maxSum;
    }
}