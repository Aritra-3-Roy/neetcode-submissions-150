class Solution {
    public void func(int ind, int nums[], List<Integer>list, List<List<Integer>>ans)
    {
        if(ind >= nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[ind]);
        func(ind+1, nums, list, ans);
        list.remove(list.size()-1);
        func(ind+1, nums, list, ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        if(nums.length == 0){
            return ans;
        }
        List<Integer>list = new ArrayList<>();
        func(0, nums, list, ans);
        return ans;
    }
}
