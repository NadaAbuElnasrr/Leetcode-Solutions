class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> indxs = new ArrayList<>();
        if (s.length() < p.length()) return indxs;
        int[] arrP= new int[26];
        int[] arrS= new int[26];
        for(int i=0;i<p.length();i++){
            arrP[p.charAt(i)-'a']++;
            arrS[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(arrP,arrS)) indxs.add(0);
        for(int i=p.length();i<s.length();i++){
            arrS[s.charAt(i)-'a']++;
            arrS[s.charAt(i-p.length())-'a']--;
            if(Arrays.equals(arrP,arrS)) indxs.add(i-p.length()+1);
        }
        return indxs;
    }
}
