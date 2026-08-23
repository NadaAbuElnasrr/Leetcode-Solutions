class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int r = s.length() - 1, l = 0;
        while (l < r) {
            if (!Character.isLetterOrDigit(s.charAt(l)))
                l++;
            else if (!Character.isLetterOrDigit(s.charAt(r)))
                r--;
            else{
                if (s.charAt(l) != s.charAt(r))
                    return false;
                l++;r--;
            }

        }
        return true;
    }
}