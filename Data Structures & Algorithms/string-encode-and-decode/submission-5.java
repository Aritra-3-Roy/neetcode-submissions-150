class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String s : strs){
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        int i=0,j=0;
        List<String>ans = new ArrayList<>();
        while(i < str.length())
        {
            j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i, j));

            String word = str.substring(j+1, j + 1 + len);
            ans.add(word);
            i = 1 + j + len;
        }
        return ans;
    }
}