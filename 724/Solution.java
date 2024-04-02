class Solution {
    public int pivotIndex(int[] nums) {
        int p = 0, l = 0, r = 0;
        for(int i = 1; i < nums.length; i++) r += nums[i];
        while (p < nums.length) {
            if(l == r) return p;
            l += nums[p];
            r -= p + 1 >= nums.length ? 0 : nums[p + 1];
            p++;
        }
        return -1;
    }
}