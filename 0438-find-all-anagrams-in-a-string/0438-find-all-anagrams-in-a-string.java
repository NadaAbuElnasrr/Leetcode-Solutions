class Solution {
    public String sortString(String s) {
        char[] arrChar = s.toCharArray();//from string to array of characters
        Arrays.sort(arrChar);
        String sortedString = new String(arrChar); //CharArr->string
        return sortedString;
    }

    public List<Integer> findAnagrams(String s, String p) {

        ArrayList<Integer> indxs = new ArrayList<>();
        String P = sortString(p);
        for (int i = 0; i <=s.length() - p.length(); i++) {
            String w = s.substring(i, i + p.length());
            String W = sortString(w);
            if (W.equals(P)) {
                indxs.add(i);
            }
        }
        return indxs;
    }
}