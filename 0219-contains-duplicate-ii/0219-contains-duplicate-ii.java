class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (freq.containsKey(nums[i])) {
                if (i - freq.get(nums[i]) <= k)
                    return true;
            }
            freq.put(nums[i], i);
        }
        return false;
    }
}