class Solution {
    public int largestAltitude(int[] gain) {
        int r = 0, a = 0;
        for(int i = 0; i < gain.length; i++){
            a += gain[i];
            if(a > r) r = a;
        }
        return r;    
    }
}