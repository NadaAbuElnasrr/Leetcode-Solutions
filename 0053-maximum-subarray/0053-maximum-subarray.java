class Solution {
    public int maxSubArray(int[] nums) {
        //Kadane's Algorithm
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(sum, max);
            sum = Math.max(sum, 0);
        }
        return max;
    }
}