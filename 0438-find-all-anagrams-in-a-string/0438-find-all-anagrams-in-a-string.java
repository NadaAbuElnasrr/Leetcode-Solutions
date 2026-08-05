class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> indxs = new ArrayList<>();
        if (s.length() < p.length()) return indxs;

        String window = "";
        for (int i = 0; i < p.length(); i++) {
            window += s.charAt(i);
        }

        String sortedP = sortString(p);
        
        for (int i = p.length(); i < s.length(); i++) {
            String sortedWindow = sortString(window);
            if (sortedWindow.equals(sortedP)) {
                indxs.add(i - p.length());
            }
            window = window.substring(1) + s.charAt(i);
        }
        
        if (sortString(window).equals(sortedP)) {
            indxs.add(s.length() - p.length());
        }

        return indxs;
    }

    public String sortString(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
