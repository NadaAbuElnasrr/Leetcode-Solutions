class Solution {
    public int characterReplacement(String s, int k) {
        //longest substring ---> /Dinamic sliding window
        HashMap<Character,Integer> freq = new HashMap<>();
        int l=0,ans=0,maxFreq=0;
        for(int r=0;r<s.length();r++){
            freq.put(s.charAt(r),freq.getOrDefault(s.charAt(r),0)+1);
            maxFreq=Integer.max(maxFreq,freq.get(s.charAt(r)));
            while(r-l+1-maxFreq>k){
                 freq.put(s.charAt(l),freq.getOrDefault(s.charAt(l),0)-1);
                 if(freq.get(s.charAt(l))==0) freq.remove(s.charAt(l));
                 l++;
            }
            ans = Integer.max(r-l+1,ans);
        }
        return ans;
    }
}