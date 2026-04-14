class Solution {
    public String func(String s)
    {
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        return String.valueOf(ch);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>ans = new ArrayList<>();
        Map<String, List<String>>map = new HashMap<>();

        for(String s : strs)
        {
            String k = func(s);
            if(!map.containsKey(k)){
                map.put(k, new ArrayList<>());
            }
            map.get(k).add(s);
        }

        for(Map.Entry<String, List<String>>it : map.entrySet()){
            ans.add(it.getValue());
        }
        return ans;
    }
}
