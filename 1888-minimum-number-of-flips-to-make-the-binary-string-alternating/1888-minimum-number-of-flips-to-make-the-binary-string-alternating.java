class Solution {
    public int minFlips(String s) {
        //create the right strings
        StringBuilder r1 = new StringBuilder("1");
        StringBuilder r2 = new StringBuilder("0");
        String S = s + s;//when all elements move from the start to end
        for (int i = 0; i < S.length(); i++) {
            if (r1.charAt(r1.length() - 1) == '1') {
                r1.append('0');
                r2.append('1');
            } else {
                r1.append('1');
                r2.append('0');
            }
        }
        
        int cnt1 = 0, cnt2 = 0;
        //move window to get min count of flips
        for (int i = 0; i < s.length(); i++) {
            if (S.charAt(i) != r1.charAt(i)) {
                cnt1++;
            }
            if (S.charAt(i) != r2.charAt(i)) {
                cnt2++;
            }
        }
        int min = Integer.min(cnt1, cnt2);
        int ans = min;
        for (int i = s.length(); i < S.length(); i++) {
            if (S.charAt(i - s.length()) != r1.charAt(i - s.length())) {
                cnt1--;
            }
            if (S.charAt(i - s.length()) != r2.charAt(i - s.length())) {
                cnt2--;
            }
            if (S.charAt(i) != r1.charAt(i)) {
                cnt1++;
            }
            if (S.charAt(i) != r2.charAt(i)) {
                cnt2++;
            }
            min = Integer.min(cnt1, cnt2);
            ans = Integer.min(min, ans);
        }
        return ans;

    }
}