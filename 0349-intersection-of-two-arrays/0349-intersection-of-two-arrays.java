class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i=0,j=0;
        int n = nums1.length,m=nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> sol = new ArrayList<>();
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums2[j]<nums1[i]){
                j++;
            }
            else{
                if(sol.isEmpty() || sol.get(sol.size()-1)!=nums1[i]){
                    sol.add(nums1[i]);
                }
                i++;j++;
            }
        }
        int[] res = new int[sol.size()];
        for(int k=0;k<sol.size();k++){
            res[k]=sol.get(k);
        }
        return res;
    }
}