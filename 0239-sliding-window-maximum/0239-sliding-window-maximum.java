class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> win = new ArrayDeque<>();
        for (int i = 0; i < k; i++) {
            while (!win.isEmpty() && nums[i] >= nums[win.peekLast()])
                win.removeLast();
            win.addLast(i);
        }
        int[] res = new int[nums.length - k + 1];
        res[0] = nums[win.peekFirst()];
        for (int i = k; i < nums.length; i++) {
            if (win.peekFirst() == i - k) {
                win.removeFirst();
            }
            while (!win.isEmpty() && nums[i] >= nums[win.peekLast()])
                win.removeLast();
            win.addLast(i);
            res[i - k + 1] = nums[win.peekFirst()];

        }
        return res;
    }
}