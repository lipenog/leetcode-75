class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder();
        char[] stack = new char[s.length()];
        int t = -1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'A' || 
            s.charAt(i) == 'e' || s.charAt(i) == 'E' ||
            s.charAt(i) == 'i' || s.charAt(i) == 'I' ||
            s.charAt(i) == 'o' || s.charAt(i) == 'O' || 
            s.charAt(i) == 'u' || s.charAt(i) == 'U') stack[++t] = s.charAt(i);
        }
        if(t == -1) return s;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'A' || 
            s.charAt(i) == 'e' || s.charAt(i) == 'E' ||
            s.charAt(i) == 'i' || s.charAt(i) == 'I' ||
            s.charAt(i) == 'o' || s.charAt(i) == 'O' || 
            s.charAt(i) == 'u' || s.charAt(i) == 'U') sb.append(stack[t--]);
            else sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
