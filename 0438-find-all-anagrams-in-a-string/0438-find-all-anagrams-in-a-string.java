class Solution {
    public boolean equal(int[] s1, int[] s2) {
        for (int i = 0; i < 26; i++) {
            if (s1[i] != s2[i])
                return false;
        }
        return true;
    }

    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> indxs = new ArrayList<>();
        if (s == null || p == null || s.length() < p.length()) {
            return indxs;
        }
        int[] pCnt = new int[26];
        int[] sCnt = new int[26];
        for (int i = 0; i < p.length(); i++) {
            pCnt[p.charAt(i) - 'a']++;
            sCnt[s.charAt(i) - 'a']++;
        }
        if (equal(pCnt, sCnt))
            indxs.add(0);
        for (int i = p.length(); i < s.length(); i++) {
            sCnt[s.charAt(i) - 'a']++;
            sCnt[s.charAt(i - p.length()) - 'a']--;
            if (equal(pCnt, sCnt))
                indxs.add(i - p.length() + 1);
        }
        return indxs;
    }
}