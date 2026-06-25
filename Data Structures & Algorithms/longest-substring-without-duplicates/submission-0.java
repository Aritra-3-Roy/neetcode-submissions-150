class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLen = 0;
        Set<Character>list = new HashSet<>();

        while(right < s.length())
        {
            char ch = s.charAt(right);

            if(!list.contains(ch)){
                list.add(ch);
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            }
            else{
                list.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }
}
