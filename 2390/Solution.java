class Solution {
    public String removeStars(String s) {
        char[] stack = new char[s.length()];
        StringBuilder sb = new StringBuilder();
        int t = -1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '*'){
                t--;
            } else {
                stack[++t] = s.charAt(i);
            }
        }
        for(int i = 0; i <= t; i++){
            sb.append(stack[i]);
        }
        return sb.toString();
    }
}