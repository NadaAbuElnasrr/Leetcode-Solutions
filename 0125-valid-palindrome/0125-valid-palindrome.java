class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String str ="";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c - 'a' >= 0 && c - 'a' < 26 )||( c-'0'>=0 && c-'0'<=9)) {
                str+=c;
            }
        }
        int r = str.length() - 1, l = 0;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}