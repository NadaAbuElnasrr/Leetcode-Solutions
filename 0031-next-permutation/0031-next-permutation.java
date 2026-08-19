class Solution {
    public void nextPermutation(int[] nums) {
        //find the break point 
        int n = nums.length;
        int indx = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i + 1] > nums[i]) {
                indx = i;
                break;
            }
        }
        if (indx == -1) {
            reverse(nums, 0, n);
        }
        //find the first number > nums[indx] : as the array after indx is in descending order 
        //so the first element we find greater than nums[indx] will be the target
        else {
            for (int i = n - 1; i > indx; i--) {
                if (nums[i] > nums[indx]) {
                    swap(nums, i, indx);
                    break;
                }
            }
            reverse(nums, indx + 1, n);
        }
    }

    public static void reverse(int[] arr, int start, int end) {
        int i = start, j = end - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}