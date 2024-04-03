class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l = 0, r = 0;
        double a = 0;
        double m = Double.MIN_EXPONENT;
        for(; r < nums.length ; r++){
            a += nums[r];
            if(r - l + 1 == k) {
                m = Math.max(m, a/k);
                a -= nums[l];
                l++;
            }
        }
        return m;
    }
}