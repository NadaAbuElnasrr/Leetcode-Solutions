class Solution {
    public String minWindow(String s, String t) {
        //Dinamic sliding window
        HashMap<Character, Integer> T = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            T.put(t.charAt(i), T.getOrDefault(t.charAt(i), 0) + 1);
        }
        int l = 0, cnt = t.length();
        int L = 0, R = 0, min = Integer.MAX_VALUE;
        for (int r = 0; r < s.length(); r++) {
            char rc = s.charAt(r);
            if (T.containsKey(rc)) {
                T.put(rc, T.getOrDefault(rc, 0) - 1);
                if (T.get(rc) >= 0)
                    cnt--;
            }

            while (cnt == 0) {
                if (r - l + 1 < min) {
                    min = r - l + 1;
                    L = l;
                    R = r;
                }
                char lc = s.charAt(l);
                if (T.containsKey(lc)) {
                    T.put(lc, T.getOrDefault(lc, 0) + 1);
                    if (T.get(lc) > 0)
                        cnt++;
                }
                l++;
            }

        }
        String ans = s.substring(L, R + 1);
        if (min == Integer.MAX_VALUE) {
            return "";
        } else {
            return s.substring(L, R + 1);
        }
    }
}