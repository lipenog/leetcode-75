class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int[] stack = new int[asteroids.length];
        int t = 0;
        stack[0] = asteroids[0];
        for(int i = 1; i < asteroids.length; i++){
            int p = stack[t];
            int a = asteroids[i];
            if((p < 0 && a > 0) || (p > 0 && a < 0)){
                if(Math.abs(p) != Math.abs(a)) stack[t] = Math.max(Math.abs(p), Math.abs(a));
                else t--;
            } else {
                stack[++t] = a;
            }
        }
        int[] r = new int[t];
        for(int i = 0; i < t; i++) r[i] = stack[i];
        return r;
    }
}