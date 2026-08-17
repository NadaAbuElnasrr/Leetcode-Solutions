class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int ans=-1;
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == 1) {
                ans= nums[i];
                break;
            }
        }
        return ans;
    }
}