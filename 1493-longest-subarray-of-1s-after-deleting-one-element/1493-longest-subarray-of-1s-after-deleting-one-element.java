class Solution {
    public int longestSubarray(int[] nums) {
        int l=0,max=0,zeros=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0) zeros++;
            while(zeros>1){
               if(nums[l]==0) zeros--;
               l++;
            }      
            max=Math.max(r-l,max);
        }
        return max;
    }
}