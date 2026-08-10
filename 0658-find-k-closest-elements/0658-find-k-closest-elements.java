import java.util.ArrayList;
import java.util.List;

class Solution {
   
    public int binarySearch(int[] arr, int l, int h, int key) {
        if (l >= h) {
            return l; 
        }
        
        int mid = l + (h - l) / 2;
        
        if (arr[mid] == key) {
            return mid;
        } else if (key < arr[mid]) {
            return binarySearch(arr, l, mid, key);
        } else {
            return binarySearch(arr, mid + 1, h, key);
        }
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
       
        int index = binarySearch(arr, 0, arr.length - 1, x);

        int left = index - 1;
        int right = index;

        while (right - left - 1 < k) {
            if (left < 0) {
                right++;
            } else if (right >= arr.length) {
                left--;
            } else if (Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)) {
                left--;
            } else {
                right++; 
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = left + 1; i < right; i++) {
            result.add(arr[i]);
        }

        return result;
    }
}