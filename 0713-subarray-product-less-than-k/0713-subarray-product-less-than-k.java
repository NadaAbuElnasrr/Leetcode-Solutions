class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l=0,currentProduct=1;
        int res=0;
        for(int r=0;r<nums.length;r++){ 
            currentProduct*=nums[r];
            while(l <= r && currentProduct>=k){
                currentProduct/=nums[l];
                l++;
            }
            res+=r-l+1;
        }
        return res;
    }
}