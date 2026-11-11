class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
           Set<List<Integer>> ans=new HashSet<>();
        List<Integer> curr=new ArrayList<>();
        Arrays.sort(nums);
        fun(nums,0,curr,ans);
        return new ArrayList<>(ans);
    }
    public void fun(int nums[],int i,List<Integer>curr,Set<List<Integer>> ans){
        if(i==nums.length){
        ans.add(new ArrayList<>(curr));
        return;       
       }curr.add(nums[i]);
       fun(nums,i+1,curr,ans);
       curr.remove(curr.size()-1);
       fun(nums,i+1,curr,ans);
    } 
}