class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder r = new StringBuilder();
        int i = 0;
        for(; i < word1.length() && i < word2.length(); i++){
            r.append(word1.charAt(i));
            r.append(word2.charAt(i));
        }
        if(i < word1.length()) r.append(word1.substring(i));
        if(i < word2.length()) r.append(word2.substring(i));
        return r.toString();
    }
}