class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer>map = new HashMap<>();
        for(int it : nums){
            map.put(it, map.getOrDefault(it,0)+1);
        }
        for(Map.Entry<Integer, Integer>it : map.entrySet())
        {
            if(it.getValue() > 1)
                return true;
        }
        return false;
    }
}