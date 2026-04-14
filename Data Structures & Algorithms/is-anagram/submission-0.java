class Solution {
    public boolean isAnagram(String s, String t) {
        int vis[] = new int[26];
        for(char ch : s.toCharArray()){
            vis[ch - 'a']++;
        }
        for(char ch : t.toCharArray()){
            vis[ch - 'a']--;
        }
        for(int it : vis){
            if(it != 0){
                return false;
            }
        }
        return true;
    }
}
