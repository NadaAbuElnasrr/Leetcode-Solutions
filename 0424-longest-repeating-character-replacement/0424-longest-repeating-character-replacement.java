class Solution {
    public int characterReplacement(String s, int k) {
        //longest substring ---> /Dinamic sliding window
        HashMap<Character, Integer> freq = new HashMap<>();
        int l = 0, ans = 0, maxFreq = 0;
        for (int r = 0; r < s.length(); r++) {
            char rc = s.charAt(r);
            freq.put(rc, freq.getOrDefault(rc, 0) + 1);
            maxFreq = Math.max(maxFreq, freq.get(rc));
            while (r - l + 1 - maxFreq > k) {
                char lc = s.charAt(l);
                freq.put(lc, freq.get(lc) - 1);
                if (freq.get(lc) == 0)
                    freq.remove(lc);
                l++;
            }
            ans = Integer.max(r - l + 1, ans);
        }
        return ans;
    }
}