class Solution {
    public int longestSubarray(int[] nums) {
       //longest subarray----> Dinamic sliding window
       int l=0,ans=0,zeros=0;
       for(int r=0;r<nums.length;r++){
              if(nums[r]==0) zeros++;
              while(zeros>1){
                if(nums[l]==0) zeros--;
                l++;
              }
              ans = Integer.max(r-l,ans);
       }
       return ans;
    }
}