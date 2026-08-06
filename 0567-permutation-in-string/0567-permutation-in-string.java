class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;
        int[] S1 = new int[26];
        int[] S2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            S1[s1.charAt(i) - 'a']++;
            S2[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(S1, S2)) {
            return true;
        }
        int l = 0;
        for (int r = s1.length(); r < s2.length(); r++) {
            S2[s2.charAt(r) - 'a']++;
            S2[s2.charAt(l) - 'a']--;
            l++;

            if (Arrays.equals(S1, S2))
                return true;
        }
        return false;
    }
}