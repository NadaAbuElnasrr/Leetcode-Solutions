class Solution {
    public int totalFruit(int[] fruits) {
        //Dinamic sliding window 
        int l = 0, ans = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int r = 0; r < fruits.length; r++) {
            freq.put(fruits[r], freq.getOrDefault(fruits[r], 0) + 1);
            while (freq.size() > 2) {
                freq.put(fruits[l], freq.get(fruits[l]) - 1);
                if (freq.get(fruits[l]) == 0)
                    freq.remove(fruits[l]);
                l++;    
            }
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}