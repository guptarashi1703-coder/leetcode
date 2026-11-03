class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        fun(nums,0,curr,ans);
        return ans;
    }
    public void fun(int nums[],int i,List<Integer>curr,List<List<Integer>> ans){
        if(i==nums.length){
        ans.add(new ArrayList<>(curr));
        return;       
       }curr.add(nums[i]);
       fun(nums,i+1,curr,ans);
       curr.remove(curr.size()-1);
       fun(nums,i+1,curr,ans);
    }
}