class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0, ans = 0, maxFreq = 0;
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int r = 0; r < s.length(); r++) {
            freq.put(s.charAt(r), freq.getOrDefault(s.charAt(r), 0) + 1);
            maxFreq = Math.max(maxFreq, freq.get(s.charAt(r)));
            while (r - l + 1 - maxFreq > k) {
                freq.put(s.charAt(l), freq.get(s.charAt(l)) - 1);
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}