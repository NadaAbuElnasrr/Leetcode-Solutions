class Solution {
    public int maxVowels(String s, int k) {
        int[] freq = new int[26];
        for(int i=0;i<k;i++){
            freq[s.charAt(i)-'a']++;
        }
        int v=0,ans=0;
        v=freq['a'-'a']+freq['e'-'a']+freq['i'-'a']+freq['o'-'a']+freq['u'-'a'];
        ans=Math.max(v,ans);
        for(int i=k;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[s.charAt(i-k)-'a']--;
            v=freq['a'-'a']+freq['e'-'a']+freq['i'-'a']+freq['o'-'a']+freq['u'-'a'];
            ans=Math.max(v,ans);
        }
        return ans;
    }
}