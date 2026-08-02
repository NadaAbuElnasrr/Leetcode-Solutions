class Solution {
    public int totalFruit(int[] fruits) {
        int maxLength=0,l=0;
        HashMap<Integer,Integer> window=new HashMap<>();
        for(int r=0;r<fruits.length;r++){
            window.put(fruits[r],window.getOrDefault(fruits[r],0)+1);
            while(window.size()>2){
              window.put(fruits[l],window.get(fruits[l])-1);
              if(window.get(fruits[l])==0) window.remove(fruits[l]);
              l++;
            }
            
            if(r-l+1>maxLength) maxLength=r-l+1;
        }
        return maxLength;
    }
}