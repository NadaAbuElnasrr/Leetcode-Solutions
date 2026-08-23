class Solution {
    public int maxArea(int[] h) {
        int l = 0, r = h.length - 1;
        int res = 0;
        while (l < r) {
            int minL = Math.min(h[l], h[r]);
            res = Math.max(minL * (r - l), res);
            if (h[l] > h[r])
                r--;
            else
                l++;
        }
        return res;
    }
}