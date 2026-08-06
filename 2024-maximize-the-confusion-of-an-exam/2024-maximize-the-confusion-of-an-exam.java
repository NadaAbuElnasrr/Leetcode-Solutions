class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        //Dinamic Sliding window
        int[] freq = new int[26];
        int l=0,ans=0,maxFreq=0;
        for(int r=0;r<answerKey.length();r++){
            char rc=answerKey.charAt(r);
            freq[rc-'A']++;
            maxFreq=Integer.max(maxFreq,freq[rc-'A']);
            while(r-l+1-maxFreq>k){
                char lc =answerKey.charAt(l);
                freq[lc-'A']--;
                l++;
            }
            ans=Integer.max(ans,r-l+1);
        }
        return ans;
    }
}