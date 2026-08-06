class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        //Dinamic Sliding window
        HashMap<Character,Integer> freq = new HashMap<>();
        int l=0,ans=0,maxFreq=0;
        for(int r=0;r<answerKey.length();r++){
            char rc=answerKey.charAt(r);
            freq.put(rc,freq.getOrDefault(rc,0)+1);//T-4 F-2
            maxFreq=Integer.max(maxFreq,freq.get(rc));//4
            while(r-l+1-maxFreq>k){
                char lc =answerKey.charAt(l);
                freq.put(lc,freq.getOrDefault(lc,0)-1);
                l++;
            }
            ans=Integer.max(ans,r-l+1);//4
        }
        return ans;
    }
}