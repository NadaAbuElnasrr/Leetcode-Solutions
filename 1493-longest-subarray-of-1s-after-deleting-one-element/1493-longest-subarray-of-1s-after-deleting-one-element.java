class Solution {
    public int longestSubarray(int[] nums) {
        int l=0,zeros=0,ans=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0) zeros++;
            while(zeros>1){
                if(nums[l]==0) zeros--;
                l++; 
            }
            if(r-l>ans) ans=r-l;
        }
        return ans;
    }
}