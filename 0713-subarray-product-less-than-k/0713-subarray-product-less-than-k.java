class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int l=0,ans=0,product=1;
        for(int r=0;r<nums.length;r++){
            product*=nums[r];
            while(product>=k){
                product/=nums[l];
                l++;
            }
            ans+=r-l+1;
        }
        return ans;
    }
}