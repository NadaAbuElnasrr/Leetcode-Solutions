class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        if (k > arr.length)
            return 0;
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        int ans = 0;
        if (windowSum >= threshold * k)
            ans++;
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i];
            windowSum -= arr[i - k];
            if (windowSum >= threshold * k)
                ans++;
        }
        return ans;
    }
}